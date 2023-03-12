package com.test.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] ={-11,12, 11, 13, 5, 6,0,800};
		insertionSort(arr);
	}
	public static void insertionSort(int[] a1) {
		for (int i = 0; i < a1.length; i++) {
			if((i+1)<a1.length) {
				if(a1[i]<a1[i+1]) {
					 int temp=a1[i+1];
					 a1[i+1]=a1[i];
					 a1[i]=temp;
					 for(int j=i+1;j>=0;j--) {
						 if((j-1)>=0) {
							 if	(a1[j]>a1[j-1]) {
							      int temp1=a1[j];
							      a1[j]=a1[j-1];
							      a1[j-1]=temp1;      
							 }
						 }
					 }
				}
			}
		}
		System.out.println(Arrays.toString(a1));
	}

}
