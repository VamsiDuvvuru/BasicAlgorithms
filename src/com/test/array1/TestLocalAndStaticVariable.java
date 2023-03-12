package com.test.array1;

public class TestLocalAndStaticVariable {
	
	private static int val1=0;
	
	private int val2=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=0;i<=10;i++) {
    	  val1++;
    	  TestLocalAndStaticVariable obj1=new TestLocalAndStaticVariable();
    	  obj1.val2++;
      }
	}

}
