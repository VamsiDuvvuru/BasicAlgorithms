package com.test.array1;

import java.util.Arrays;
import java.util.Iterator;

public class RotateArray {
	
	
	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5};
		int k=2;
	    for (int i = 0; i < a1.length; i++) {
	    	rotateArray(a1,i);
	    	System.out.println( "----------");
		}
		
	}
	
	static int[] rotateArray(int[] a1,int k) {
		int[] fl=new int[a1.length];
		int j=0;
		for(int i=k;i<a1.length;i++) {
			fl[j]=a1[i];
			 j++;
		}
		
		for(int i=0;i<k;i++) {
			fl[j]=a1[i];
			j++;
		}
		for (int i = 0; i < fl.length; i++) {
			System.out.println(fl[i]);
		}
		return fl;
	}

}
