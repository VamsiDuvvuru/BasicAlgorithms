package com.test.array1;

import java.util.Arrays;

public class RotationCountInRotatedSortedArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={15, 18, 2, 3, 6, 12};
		int count=0;
		for (int i = 0; i < a1.length; i++) {
			if((i+1)<a1.length) {
				if(a1[i]>a1[i+1]) {
					a1=rotateArray(a1);
					i=-1;
					count++;
				}
			}
		}
		System.out.println("count ::"+count);
	}
	
  static int[] rotateArray(int[] a1) {
	  int val=a1[0];
	  for (int i = 0; i < a1.length; i++) {
		if((i+1)<a1.length) {
			a1[i]=a1[i+1];
		}
	  }
	  a1[a1.length-1]=val;
	  return a1;  
  }
	
	

}
