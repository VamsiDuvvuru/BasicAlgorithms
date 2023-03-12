package com.test.algorithms.sorting;

import java.util.Arrays;

public class QuickSortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 25, 12, 22, 11,0,12,1,100,2,600,2000000000};
		arr=startDescQuickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	private static int[] startDescQuickSort(int[] a1,int start,int end) {
		if(start<end) {
			int loc=quickSort(a1, start, end);
			startDescQuickSort(a1, start, loc-1);
			startDescQuickSort(a1, loc+1, end);
		}
		return a1;
	}
	
	private static int quickSort(int[] a1,int start,int end) {
		int pivot=a1[start];
		int lb=start;
		int ub=end;
		while(lb<ub) {
			while(lb<a1.length && a1[lb]>=pivot) {
				lb++;
			}
			while(ub>=0 && a1[ub]<=pivot) {
				ub--;
			}
			if(lb<=ub) {
				swap(a1, lb,ub);
			}
		}
		
		swap(a1, start, ub);
		return ub;
	}
	
	private static void swap(int[] a1,int start,int end) {
		int temp=a1[start];
		a1[start]=a1[end];
		a1[end]=temp;
	}

}
