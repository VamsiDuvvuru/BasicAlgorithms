package com.test.array1;

import java.util.Arrays;
import java.util.Iterator;

public class RotateArrayByClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		System.out.println(Arrays.toString(rotateByClockWise(a)));
	}
	
	static int[] rotateByClockWise(int[] a) {
		int[] a1=new int[a.length];
		a1[0]=a[a.length-1];
		for (int i = 0; i < a.length-1; i++) {
			a1[i+1]=a[i];			
		}
		return a1;
	}

}
