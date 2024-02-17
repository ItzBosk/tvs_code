package randoop;

import junit.framework.*;


class Ostello {
	
	private boolean lettiperStanza[][]= new boolean[10][5];
	
	public Ostello(){
		for(int i=0;i<10;i++)
			for(int j=0;j<5;j++)
				lettiperStanza[i][j]=true;
	}
	
	public boolean checkin(int stanza, int letto){
	//occupa letto specifico
	
		if(stanza<0 || stanza>9 || letto <0 || letto>4)
			return false;
		if(lettiperStanza[stanza][letto]){
			lettiperStanza[stanza][letto]=false;
			return true;
		}
		return false;
		
	}
	
	public boolean checkin(int stanza){
	//occupa il primo letto libero della stanza
		if(stanza<0 || stanza>9)
			return false;
		for(int i=0;i<5;i++){
			if(lettiperStanza[stanza][i]){
				lettiperStanza[stanza][i]=false;
			    return true;			    
			 }
		}
		return false;
		
	}
	
	
	public boolean libera(int stanza){
	//una stanza è libera se ha tutti i letti liberi
		if(stanza<0 || stanza>9)
			return false;
		for(int i=0;i<5;i++){
			if(!lettiperStanza[stanza][i]){
			    return false;			    
			 }
		}
		
		return true;
		
	}

}


public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var7 = var0.libera(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var8 = var0.checkin(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var7 = var0.libera(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(100);
    boolean var6 = var0.libera(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.libera((-1));
    boolean var7 = var0.checkin(100, 1);
    boolean var9 = var0.libera(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.checkin(1);
    boolean var6 = var0.checkin((-1));
    boolean var9 = var0.checkin(0, (-1));
    boolean var11 = var0.libera(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.checkin(1);
    boolean var6 = var0.checkin((-1));
    boolean var9 = var0.checkin(0, (-1));
    boolean var12 = var0.checkin(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var7 = var0.libera(1);
    boolean var9 = var0.libera(0);
    boolean var11 = var0.checkin((-1));
    boolean var13 = var0.checkin(1);
    boolean var15 = var0.libera(100);
    boolean var17 = var0.checkin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var7 = var0.libera(1);
    boolean var9 = var0.checkin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(100);
    boolean var6 = var0.checkin(100);
    boolean var8 = var0.libera((-1));
    boolean var10 = var0.checkin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(1);
    boolean var6 = var0.checkin(1);
    boolean var8 = var0.libera((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(1, 10);
    boolean var7 = var0.checkin(1);
    boolean var9 = var0.checkin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var8 = var0.checkin(10, 10);
    boolean var10 = var0.checkin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var5 = var0.checkin(1, (-1));
    boolean var7 = var0.checkin((-1));
    boolean var10 = var0.checkin((-1), (-1));
    boolean var12 = var0.libera(100);
    boolean var14 = var0.libera(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(0, 100);
    boolean var7 = var0.checkin((-1));
    boolean var9 = var0.checkin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.checkin(1);
    boolean var6 = var0.checkin((-1));
    boolean var9 = var0.checkin(10, (-1));
    boolean var12 = var0.checkin(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(100);
    boolean var6 = var0.checkin(100);
    boolean var9 = var0.checkin(1, 100);
    boolean var12 = var0.checkin(10, 10);
    boolean var15 = var0.checkin(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(100);
    boolean var6 = var0.checkin(100);
    boolean var8 = var0.libera(1);
    boolean var11 = var0.checkin(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(0, 100);
    boolean var7 = var0.checkin((-1));
    boolean var10 = var0.checkin(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.libera(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var7 = var0.checkin((-1));
    boolean var10 = var0.checkin(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(100);
    boolean var6 = var0.checkin(100);
    boolean var8 = var0.libera(1);
    boolean var10 = var0.libera(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.libera(1);
    boolean var7 = var0.checkin(0, (-1));
    boolean var9 = var0.libera(10);
    boolean var12 = var0.checkin(10, 100);
    
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

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var5 = var0.checkin(1, (-1));
    boolean var7 = var0.checkin((-1));
    boolean var10 = var0.checkin((-1), (-1));
    boolean var12 = var0.libera(100);
    boolean var14 = var0.libera(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.libera(1);
    boolean var7 = var0.checkin(0, (-1));
    boolean var9 = var0.libera(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var5 = var0.checkin(1, (-1));
    boolean var7 = var0.libera(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.checkin(1);
    boolean var6 = var0.libera((-1));
    boolean var8 = var0.checkin(100);
    boolean var11 = var0.checkin(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(1, 10);
    boolean var7 = var0.checkin(1);
    boolean var10 = var0.checkin(0, (-1));
    boolean var12 = var0.checkin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var5 = var0.checkin(1, (-1));
    boolean var7 = var0.checkin((-1));
    boolean var9 = var0.libera(10);
    boolean var11 = var0.checkin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.libera(1);
    boolean var7 = var0.checkin(0, (-1));
    boolean var10 = var0.checkin((-1), (-1));
    boolean var12 = var0.libera((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.checkin(1);
    boolean var7 = var0.checkin((-1), 1);
    boolean var9 = var0.checkin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.checkin(1);
    boolean var6 = var0.checkin((-1));
    boolean var8 = var0.checkin(100);
    boolean var10 = var0.checkin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    Ostello var0 = new Ostello();
    boolean var2 = var0.libera((-1));
    boolean var4 = var0.checkin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.libera(1);
    boolean var7 = var0.checkin(0, (-1));
    boolean var9 = var0.libera(10);
    boolean var12 = var0.checkin((-1), (-1));
    
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

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(1);
    boolean var7 = var0.checkin(0, 10);
    boolean var9 = var0.checkin((-1));
    boolean var11 = var0.checkin(10);
    boolean var13 = var0.checkin(10);
    
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

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.checkin(1);
    boolean var6 = var0.checkin((-1));
    boolean var9 = var0.checkin(10, (-1));
    boolean var11 = var0.libera(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.checkin(1);
    boolean var6 = var0.libera(0);
    boolean var8 = var0.checkin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(100);
    boolean var6 = var0.checkin(100);
    boolean var9 = var0.checkin(1, 100);
    boolean var11 = var0.checkin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var7 = var0.libera((-1));
    boolean var10 = var0.checkin(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(0, 100);
    boolean var7 = var0.checkin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var4 = var0.libera((-1));
    boolean var7 = var0.checkin(100, 1);
    boolean var9 = var0.libera((-1));
    boolean var11 = var0.libera((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.checkin(100);
    boolean var6 = var0.libera(10);
    boolean var8 = var0.libera(10);
    boolean var11 = var0.checkin(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(1);
    boolean var5 = var0.checkin(1, (-1));
    boolean var7 = var0.checkin((-1));
    boolean var9 = var0.libera(10);
    boolean var12 = var0.checkin((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var7 = var0.libera(1);
    boolean var9 = var0.libera(0);
    boolean var11 = var0.checkin((-1));
    boolean var13 = var0.checkin(1);
    boolean var15 = var0.libera(100);
    boolean var17 = var0.checkin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var5 = var0.checkin(100, (-1));
    boolean var7 = var0.libera(1);
    boolean var9 = var0.libera(0);
    boolean var11 = var0.checkin((-1));
    boolean var13 = var0.checkin((-1));
    boolean var15 = var0.checkin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    Ostello var0 = new Ostello();
    boolean var2 = var0.checkin(10);
    boolean var4 = var0.libera(1);
    boolean var7 = var0.checkin(0, (-1));
    boolean var9 = var0.libera(10);
    boolean var11 = var0.libera(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

}
