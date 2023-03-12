package com.test.array1;

import java.util.Arrays;
import java.util.Iterator;

public class RotateArrayByOnePosition {
	
	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5};
		for (int i = 0; i < a1.length; i++) {
			a1=rotateByOnePosition(a1,i);
		}
	}
	static int[] rotateByOnePosition(int[] a1,int k) {
		int val=a1[0];
		for (int i = 0; i < a1.length; i++) {
			if((i+1)<a1.length) {
				a1[i]=a1[i+1];
			}	
		}
		a1[a1.length-1]=val;
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		return a1;		
	}

}
