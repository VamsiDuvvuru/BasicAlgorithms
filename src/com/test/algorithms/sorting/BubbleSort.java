package com.test.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 25, 12, 22, 11,0,12,1,100};
		bubbleSort(arr);
	}
	public static void bubbleSort(int a1[]) {
		for (int i = 0; i < a1.length; i++) {
			for (int j = i+1; j < a1.length; j++) {
				if(a1[i]<a1[j]) {
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a1));
	}

}
