package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var6 = var2.getPow((-100), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    labRats.LabRat1 var2 = new labRats.LabRat1((-100), 100);
    int var3 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var5 = var2.getMult();
    int var6 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 99);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var7 = var2.getPow(10, 1661992960);
    int var8 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-100));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(10, (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    labRats.LabRat1 var2 = new labRats.LabRat1((-100), 1);
    int var4 = var2.getCraziness((-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, 100);
    int var5 = var2.getPow(1, 1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var8 = var2.getMult();
    int var11 = var2.getPow(100, 1);
    int var12 = var2.getMult();
    int var13 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-100));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(99, (-100));
    int var15 = var2.getSum();
    int var18 = var2.getPow((-1), 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var4 = var2.getCraziness(1);
    int var5 = var2.getMult();
    int var8 = var2.getPow(1661992960, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    labRats.LabRat1 var2 = new labRats.LabRat1(99, 100);
    int var4 = var2.getCraziness(1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 290788897);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var11 = var2.getPow(100, 10);
    int var12 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-100));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var11 = var2.getPow(100, 10);
    int var12 = var2.getSum();
    int var14 = var2.getCraziness(290788897);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-234019360));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    labRats.LabRat1 var2 = new labRats.LabRat1(1, 99);
    int var5 = var2.getPow(99, 1);
    int var8 = var2.getPow(10, 1661992960);
    int var11 = var2.getPow(1, (-1));
    int var12 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var11 = var2.getPow(100, 10);
    int var12 = var2.getSum();
    int var13 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-100));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1661992959);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1661992959);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    labRats.LabRat1 var2 = new labRats.LabRat1((-1), 99);
    int var3 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-99));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var6 = var2.getCraziness(290788897);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-234019360));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var4 = var2.getCraziness(100);
    int var5 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1661992960));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getSum();
    int var5 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    labRats.LabRat1 var2 = new labRats.LabRat1(1, 99);
    int var5 = var2.getPow(99, 1);
    int var8 = var2.getPow(10, 1661992960);
    int var9 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var13 = var2.getCraziness((-100));
    int var16 = var2.getPow(1661992960, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var6 = var2.getMult();
    int var7 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-100));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    labRats.LabRat1 var2 = new labRats.LabRat1(1, 99);
    int var5 = var2.getPow(99, 1);
    int var8 = var2.getPow(10, 1661992960);
    int var9 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 99);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    labRats.LabRat1 var2 = new labRats.LabRat1((-1), 10);
    int var4 = var2.getCraziness(290788897);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-234019360));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var5 = var2.getSum();
    int var8 = var2.getPow(100, (-1));
    int var10 = var2.getCraziness((-1));
    int var11 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-100));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getSum();
    int var16 = var2.getSum();
    int var17 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 99);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    labRats.LabRat1 var2 = new labRats.LabRat1((-1), 99);
    int var4 = var2.getCraziness((-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    labRats.LabRat1 var2 = new labRats.LabRat1(1426853353, 1661992959);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), 10);
    int var9 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-100));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, 1661992959);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    labRats.LabRat1 var2 = new labRats.LabRat1((-1), (-1));
    int var3 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-2));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var6 = var2.getMult();
    int var8 = var2.getCraziness(1426853353);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-894936360));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    labRats.LabRat1 var2 = new labRats.LabRat1(0, (-100));
    int var4 = var2.getCraziness((-234019360));
    int var5 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-100));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, 100);
    int var4 = var2.getCraziness(99);
    int var5 = var2.getMult();
    int var7 = var2.getCraziness(99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1250178886);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1304428544));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1250178886);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var17 = var2.getPow(1661992959, (-1661992960));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), 10);
    int var10 = var2.getCraziness(100);
    int var11 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-100));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    labRats.LabRat1 var2 = new labRats.LabRat1((-100), (-234019360));
    int var3 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-234019460));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, 0);
    int var4 = var2.getCraziness(1426853353);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-894936360));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getMult();
    int var16 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 99);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    labRats.LabRat1 var2 = new labRats.LabRat1(99, 100);
    int var3 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 199);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var10 = var2.getCraziness((-100));
    int var11 = var2.getSum();
    int var12 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-100));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-99));
    int var3 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1328545792));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, 100);
    int var4 = var2.getCraziness(99);
    int var5 = var2.getMult();
    int var6 = var2.getMult();
    int var7 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1250178886);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1304428544));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1304428544));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1661993060);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var5 = var2.getSum();
    int var7 = var2.getCraziness(100);
    int var8 = var2.getMult();
    int var9 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 99);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var8 = var2.getMult();
    int var11 = var2.getPow(100, 1);
    int var12 = var2.getMult();
    int var13 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 99);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    labRats.LabRat1 var2 = new labRats.LabRat1((-1), (-1));
    int var5 = var2.getPow(1661993060, 1426853353);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var7 = var2.getPow(10, 1661992960);
    int var9 = var2.getCraziness((-234019360));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    labRats.LabRat1 var2 = new labRats.LabRat1(290788897, (-234019360));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getMult();
    int var16 = var2.getMult();
    int var17 = var2.getMult();
    int var18 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-100));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, 100);
    int var4 = var2.getCraziness(99);
    int var5 = var2.getMult();
    int var6 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1250178886);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1304428544));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1661993060);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-100));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    labRats.LabRat1 var2 = new labRats.LabRat1((-100), 1);
    int var3 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var3 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1661992960));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-100));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getMult();
    int var5 = var2.getCraziness(1);
    int var7 = var2.getCraziness((-1661992960));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var13 = var2.getCraziness((-100));
    int var14 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 99);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, 100);
    int var4 = var2.getCraziness(99);
    int var6 = var2.getCraziness(1250178886);
    int var9 = var2.getPow((-234019360), (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1250178886);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var4 = var2.getCraziness(100);
    int var6 = var2.getCraziness((-894936360));
    int var7 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1661992959);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getSum();
    int var16 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-100));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    labRats.LabRat1 var2 = new labRats.LabRat1(0, 99);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    labRats.LabRat1 var2 = new labRats.LabRat1((-100), 290788897);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var4 = var2.getCraziness(100);
    int var6 = var2.getCraziness((-234019460));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    labRats.LabRat1 var2 = new labRats.LabRat1((-1), (-1661992960));
    int var5 = var2.getPow(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var5 = var2.getPow(1, 1661992959);
    int var6 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1661992960));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    labRats.LabRat1 var2 = new labRats.LabRat1(1, 99);
    int var5 = var2.getPow(99, 1);
    int var6 = var2.getMult();
    int var7 = var2.getSum();
    int var8 = var2.getSum();
    int var9 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getSum();
    int var16 = var2.getSum();
    int var19 = var2.getPow((-1), 10);
    int var20 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-100));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, 100);
    int var3 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10000);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var11 = var2.getPow(0, 99);
    int var12 = var2.getSum();
    int var13 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-100));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-1), (-1));
    int var9 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-100));

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getMult();
    int var16 = var2.getMult();
    int var19 = var2.getPow(100, (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var5 = var2.getSum();
    int var8 = var2.getPow(100, (-1));
    int var9 = var2.getSum();
    int var10 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, 100);
    int var3 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1661993060);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var16 = var2.getCraziness((-1328545792));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getSum();
    int var16 = var2.getSum();
    int var19 = var2.getPow(1661993060, 290788897);
    int var22 = var2.getPow((-234019460), (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getMult();
    int var5 = var2.getCraziness(1);
    int var8 = var2.getPow((-1), 290788897);
    int var9 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-100));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var11 = var2.getPow(100, 10);
    int var12 = var2.getSum();
    int var15 = var2.getPow(99, 199);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1976132395);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var4 = var2.getCraziness(100);
    int var6 = var2.getCraziness((-894936360));
    int var7 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1661992960));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, 10);
    int var5 = var2.getPow(100, (-1328545792));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    labRats.LabRat1 var2 = new labRats.LabRat1(1976132395, 1661992959);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var5 = var2.getPow((-1), 100);
    int var6 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1661992959);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var5 = var2.getPow((-1), 100);
    int var7 = var2.getCraziness((-1304428544));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getSum();
    int var16 = var2.getSum();
    int var19 = var2.getPow((-1), 10);
    int var22 = var2.getPow(199, (-234019360));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var7 = var2.getPow(10, 1661992960);
    int var10 = var2.getPow((-1), (-1));
    int var11 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var10 = var2.getCraziness((-100));
    int var11 = var2.getSum();
    int var13 = var2.getCraziness((-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    labRats.LabRat1 var2 = new labRats.LabRat1(1976132395, (-998244351));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var11 = var2.getPow(0, 99);
    int var14 = var2.getPow((-998244351), (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    labRats.LabRat1 var2 = new labRats.LabRat1((-234019460), 10);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    labRats.LabRat1 var2 = new labRats.LabRat1(10000, 0);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(99, (-100));
    int var15 = var2.getSum();
    int var16 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-100));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    labRats.LabRat1 var2 = new labRats.LabRat1(99, 100);
    int var5 = var2.getPow(1661992959, 0);
    int var8 = var2.getPow(10000, 199);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var5 = var2.getPow((-1), 100);
    int var8 = var2.getPow((-99), 10);
    int var10 = var2.getCraziness(1426853353);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1426853353);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-894936360));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-99));
    int var5 = var2.getPow(1426853353, 1661992960);
    int var8 = var2.getPow(10000, 10000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-998244351));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(99, (-100));
    int var15 = var2.getMult();
    int var16 = var2.getSum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 99);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var6 = var2.getPow(10000, 10000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    labRats.LabRat1 var2 = new labRats.LabRat1((-100), 100);
    int var4 = var2.getCraziness(1426853353);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-894936360));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow(1, (-1));
    int var15 = var2.getMult();
    int var16 = var2.getMult();
    int var17 = var2.getMult();
    int var20 = var2.getPow((-998244351), 1661993060);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1040187391));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    labRats.LabRat1 var2 = new labRats.LabRat1((-2), 1661993060);
    int var5 = var2.getPow((-234019460), (-234019360));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-99));
    int var5 = var2.getPow(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1661992960);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var8 = var2.getPow((-100), (-100));
    int var11 = var2.getPow(100, 10);
    int var12 = var2.getSum();
    int var15 = var2.getPow(10, 99);
    int var18 = var2.getPow(1661993060, (-1304428544));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1661992960);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var5 = var2.getSum();
    int var8 = var2.getPow(100, (-1));
    int var10 = var2.getCraziness((-1));
    int var12 = var2.getCraziness(1661992959);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1661992962);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    labRats.LabRat1 var2 = new labRats.LabRat1(1661992960, (-1));
    int var5 = var2.getPow((-1), 100);
    int var8 = var2.getPow((-99), 10);
    int var11 = var2.getPow(290788897, (-100));
    int var12 = var2.getMult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1426853353);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1661992960));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var5 = var2.getPow(100, 1);
    int var7 = var2.getCraziness(0);
    int var9 = var2.getCraziness(1661992960);
    int var10 = var2.getSum();
    int var11 = var2.getSum();
    int var14 = var2.getPow((-2), 1250178886);
    int var16 = var2.getCraziness(199);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1792055350));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    labRats.LabRat1 var2 = new labRats.LabRat1(100, (-1));
    int var3 = var2.getSum();
    int var4 = var2.getMult();
    int var6 = var2.getCraziness(1976132395);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 87238350);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    labRats.LabRat1 var2 = new labRats.LabRat1(1426853353, 10);
    int var4 = var2.getCraziness(1250178886);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1721707529);

  }

}
