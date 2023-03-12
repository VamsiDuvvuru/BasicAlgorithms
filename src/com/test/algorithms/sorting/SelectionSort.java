package com.test.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11,0,12,1,100};
		selectionSort(arr);
	}
	static void selectionSort(int[] a1) {
		int min=a1[0];
		int minIndex=0;
		for (int i = 0; i < a1.length; i++) {
			min=a1[i];
			minIndex=i;
			for(int j=i+1;j<a1.length;j++) {
				if(a1[j]<min) {
					min=a1[j];
					minIndex=j;
				}
			}
			int temp=a1[i];
			a1[i]=a1[minIndex];
			a1[minIndex]=temp;
		}
		System.out.println(Arrays.toString(a1));
	}

}
