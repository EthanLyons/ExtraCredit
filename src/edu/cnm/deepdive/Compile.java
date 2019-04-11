package edu.cnm.deepdive;

  class Test {
    public static int i;
  }

  class hello {

    public static void main(String args[]) {
      Test t1 = new Test();
      Test t2 = new Test();
      t1.i = 10;
      System.out.println(t2.i);
    }

  }
