package com.test.array1;

import java.util.Arrays;

public class SplitTheArrayAndAddElementAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 1, 2};
		
		int k=1;
		System.out.println(Arrays.toString(splitArray(arr, k)));

	}
	
	static int[] splitArray(int [] a1,int k) {
		int [] arrayOfFinalSplittedArray=new int[a1.length];
		for(int i=0;i<k;i++) {
			arrayOfFinalSplittedArray[a1.length-1-i]=a1[i];
		}
		for(int i=0;i<a1.length-1;i++) {
			if(i+k<a1.length) {
				arrayOfFinalSplittedArray[i]=a1[i+k];
			}
			
		}
		return arrayOfFinalSplittedArray;
		
	}

}
