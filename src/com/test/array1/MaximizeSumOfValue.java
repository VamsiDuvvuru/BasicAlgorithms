package com.test.array1;

import java.util.Arrays;
import java.util.Iterator;

public class MaximizeSumOfValue {
	static int max=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arrayTorotate= {8,3,1,2};
      for (int i = 0; i < arrayTorotate.length; i++) {
		    arrayTorotate=rotate(arrayTorotate);
		    System.out.println(Arrays.toString(arrayTorotate));
	    }
      System.out.println("final max::"+max);
	}
	static int[] rotate(int[] a) {
		int tempmax=0;
		int[] rotatingArray=new int[a.length]; 
		rotatingArray[a.length-1]=a[0];
		tempmax+=a[0]*a.length-1;
		for(int i=1;i<a.length;i++) {
			rotatingArray[i-1]=a[i];
			tempmax+=a[i]*i;
		}
		System.out.println("tempmax::"+tempmax);
		if(tempmax>max) {
			max=tempmax;
		}
		return rotatingArray;
	}

}
