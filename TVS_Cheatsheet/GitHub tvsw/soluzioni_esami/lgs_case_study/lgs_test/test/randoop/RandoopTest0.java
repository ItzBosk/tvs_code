package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    boolean var7 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    boolean var6 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var12 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var17 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var18 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var15 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    boolean var15 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    boolean var14 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, true);
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var21 = var0.isValid();
    boolean var22 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, false);
    boolean var25 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    boolean var19 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, false, false);
    boolean var16 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var11 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var8 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var6 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, true);
    boolean var17 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, true, true);
    boolean var22 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var15 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var20 = var0.getValue();
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var15 = var0.isValid();
    boolean var16 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.getValue();
    boolean var6 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var21 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var18 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    boolean var23 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var11 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(false, true, true);
    boolean var25 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var17 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    boolean var19 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var21 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var15 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, true);
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    boolean var19 = var0.isValid();
    boolean var20 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var15 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    boolean var16 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var15 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, false);
    boolean var21 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    boolean var18 = var0.getValue();
    boolean var19 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    boolean var19 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    boolean var15 = var0.isValid();
    boolean var16 = var0.isValid();
    boolean var17 = var0.isValid();
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var12 = var0.isValid();
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, false);
    boolean var19 = var0.isValid();
    boolean var20 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, true);
    boolean var21 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var6 = var0.getValue();
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, true);
    boolean var21 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(true, true, false);
    boolean var12 = var0.isValid();
    boolean var13 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var14 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.getValue();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var19 = var0.isValid();
    boolean var20 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.getValue();
    boolean var6 = var0.getValue();
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var16 = var0.isValid();
    boolean var17 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var15 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var14 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    boolean var15 = var0.isValid();
    boolean var16 = var0.isValid();
    boolean var17 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var16 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var21 = var0.getValue();
    boolean var22 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    boolean var19 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    boolean var7 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    boolean var6 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var11 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    boolean var7 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var14 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    boolean var17 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var6 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var23 = var0.getValue();
    boolean var24 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    boolean var29 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.isValid();
    boolean var14 = var0.getValue();
    boolean var15 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    boolean var14 = var0.getValue();
    boolean var15 = var0.isValid();
    boolean var16 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var22 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var6 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, true, true);
    boolean var19 = var0.getValue();
    boolean var20 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.isValid();
    boolean var8 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var6 = var0.getValue();
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    boolean var14 = var0.getValue();
    boolean var15 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var6 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, false);
    boolean var19 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    boolean var14 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var23 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, false);
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var16 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var12 = var0.isValid();
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    boolean var6 = var0.getValue();
    boolean var7 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    boolean var22 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    boolean var21 = var0.getValue();
    boolean var22 = var0.isValid();
    boolean var23 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var15 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var20 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var21 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var30 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var13 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var17 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var14 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    boolean var16 = var0.isValid();
    boolean var17 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var26 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    boolean var15 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var21 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.isValid();
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var10 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var22 = var0.isValid();
    boolean var23 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    boolean var18 = var0.getValue();
    boolean var19 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var9 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var21 = var0.isValid();
    boolean var22 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var13 = var0.isValid();
    boolean var14 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var16 = var0.isValid();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    boolean var19 = var0.isValid();
    boolean var20 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    boolean var15 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    boolean var20 = var0.getValue();
    boolean var21 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var15 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(false, true, true);
    boolean var18 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    boolean var6 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var17 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var22 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, true);
    boolean var21 = var0.isValid();
    boolean var22 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(true, true, false);
    boolean var12 = var0.isValid();
    boolean var13 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, false);
    boolean var19 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var24 = var0.getValue();
    boolean var25 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, false, false);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var22 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var18 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var21 = var0.getValue();
    boolean var22 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var19 = var0.isValid();
    boolean var20 = var0.isValid();
    boolean var21 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    boolean var6 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(false, true, true);
    boolean var18 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var23 = var0.getValue();
    boolean var24 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    boolean var29 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.getValue();
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    boolean var16 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var23 = var0.getValue();
    boolean var24 = var0.getValue();
    boolean var25 = var0.getValue();
    boolean var26 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var14 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var16 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, true);
    boolean var19 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, false);
    boolean var18 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    boolean var21 = var0.getValue();
    boolean var22 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var12 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.getValue();
    boolean var14 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
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

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var12 = var0.isValid();
    boolean var13 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var20 = var0.getValue();
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var15 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.isValid();
    boolean var14 = var0.getValue();
    boolean var15 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var20 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, true);
    boolean var17 = var0.isValid();
    boolean var18 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var17 = var0.isValid();
    boolean var18 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var9 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var19 = var0.isValid();
    boolean var20 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var25 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.isValid();
    boolean var13 = var0.isValid();
    boolean var14 = var0.getValue();
    boolean var15 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, true);
    boolean var23 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    boolean var13 = var0.getValue();
    boolean var14 = var0.getValue();
    boolean var15 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var23 = var0.getValue();
    boolean var24 = var0.getValue();
    boolean var25 = var0.getValue();
    boolean var26 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.isValid();
    boolean var14 = var0.getValue();
    boolean var15 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var20 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, false);
    boolean var20 = var0.isValid();
    boolean var21 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, true);
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var17 = var0.isValid();
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    boolean var15 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var16 = var0.isValid();
    boolean var17 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var12 = var0.getValue();
    boolean var13 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, true);
    boolean var21 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var7 = var0.isValid();
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    boolean var16 = var0.isValid();
    boolean var17 = var0.getValue();
    boolean var18 = var0.getValue();
    boolean var19 = var0.isValid();
    boolean var20 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var14 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, false);
    boolean var21 = var0.isValid();
    boolean var22 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, false);
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    boolean var16 = var0.isValid();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    boolean var20 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var19 = var0.isValid();
    boolean var20 = var0.isValid();
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    boolean var15 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var26 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var25 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.getValue();
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var20 = var0.isValid();
    boolean var21 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var26 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var31 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var13 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    boolean var7 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var21 = var0.getValue();
    boolean var22 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(false, true, false);
    boolean var18 = var0.isValid();
    boolean var19 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var24 = var0.getValue();
    boolean var25 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, true, true);
    boolean var16 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    boolean var15 = var0.isValid();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, false, false);
    boolean var29 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var18 = var0.isValid();
    boolean var19 = var0.isValid();
    boolean var20 = var0.isValid();
    boolean var21 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    boolean var24 = var0.getValue();
    boolean var25 = var0.getValue();
    boolean var26 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.isValid();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(false, false, true);
    boolean var25 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, true);
    boolean var21 = var0.isValid();
    boolean var22 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, false, false);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    boolean var14 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var21 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    boolean var15 = var0.getValue();
    boolean var16 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    boolean var15 = var0.isValid();
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, false, false);
    boolean var25 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var17 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    boolean var22 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(true, false, false);
    boolean var17 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var15 = var0.getValue();
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    boolean var24 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    boolean var15 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var23 = var0.getValue();
    boolean var24 = var0.getValue();
    boolean var25 = var0.isValid();
    boolean var26 = var0.getValue();
    boolean var27 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var23 = var0.getValue();
    boolean var24 = var0.getValue();
    boolean var25 = var0.isValid();
    boolean var26 = var0.getValue();
    boolean var27 = var0.getValue();
    boolean var28 = var0.getValue();
    boolean var29 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    boolean var9 = var0.getValue();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(false, true, false);
    boolean var18 = var0.isValid();
    boolean var19 = var0.isValid();
    boolean var20 = var0.isValid();
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var10 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, false);
    boolean var20 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    boolean var19 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, true, false);
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, false);
    boolean var20 = var0.isValid();
    boolean var21 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    boolean var18 = var0.isValid();
    boolean var19 = var0.isValid();
    boolean var20 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.getValue();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    boolean var13 = var0.isValid();
    boolean var14 = var0.isValid();
    var0.computeSensorValue(false, true, false);
    boolean var19 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    boolean var11 = var0.isValid();
    boolean var12 = var0.isValid();
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    boolean var5 = var0.getValue();
    boolean var6 = var0.isValid();
    boolean var7 = var0.getValue();
    boolean var8 = var0.getValue();
    boolean var9 = var0.isValid();
    boolean var10 = var0.isValid();
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var26 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    boolean var13 = var0.getValue();
    boolean var14 = var0.getValue();
    boolean var15 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var6 = var0.getValue();
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var13 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var9 = var0.getValue();
    boolean var10 = var0.getValue();
    boolean var11 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    boolean var7 = var0.isValid();
    boolean var8 = var0.getValue();
    boolean var9 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var14 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, true);
    boolean var21 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.isValid();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(true, true, true);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    boolean var7 = var0.isValid();
    boolean var8 = var0.isValid();
    boolean var9 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(false, true, false);
    boolean var13 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var20 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    boolean var2 = var0.isValid();
    boolean var3 = var0.isValid();
    boolean var4 = var0.getValue();
    var0.computeSensorValue(false, true, true);
    boolean var9 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, true);
    boolean var15 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var7 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, false, true);
    boolean var16 = var0.getValue();
    boolean var17 = var0.getValue();
    boolean var18 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var23 = var0.getValue();
    boolean var24 = var0.getValue();
    boolean var25 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var34 = var0.isValid();
    boolean var35 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.getValue();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    var0.computeSensorValue(false, false, false);
    boolean var9 = var0.isValid();
    var0.computeSensorValue(false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    boolean var8 = var0.getValue();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(false, true, false);
    boolean var17 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    boolean var6 = var0.getValue();
    boolean var7 = var0.getValue();
    boolean var8 = var0.isValid();
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    boolean var6 = var0.getValue();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(false, true, true);
    var0.computeSensorValue(false, true, true);
    boolean var19 = var0.getValue();
    boolean var20 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var11 = var0.getValue();
    boolean var12 = var0.getValue();
    var0.computeSensorValue(false, false, false);
    var0.computeSensorValue(false, false, true);
    boolean var21 = var0.isValid();
    boolean var22 = var0.isValid();
    boolean var23 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.getValue();
    boolean var6 = var0.getValue();
    var0.computeSensorValue(true, false, false);
    boolean var11 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    lgs.sensorvoting.SensorVotingBoolean var0 = new lgs.sensorvoting.SensorVotingBoolean();
    boolean var1 = var0.getValue();
    boolean var2 = var0.isValid();
    boolean var3 = var0.getValue();
    boolean var4 = var0.isValid();
    boolean var5 = var0.isValid();
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, true, false);
    var0.computeSensorValue(true, false, false);
    var0.computeSensorValue(false, false, true);
    var0.computeSensorValue(true, true, false);
    boolean var26 = var0.isValid();
    var0.computeSensorValue(true, false, true);
    var0.computeSensorValue(true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

}
