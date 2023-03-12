package com.test.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Quick sort ascending order*/
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Quick sort : select any element from an array and take it as pivot 
		 * the elements greater than pivot add in one array 
		 * the elements less than pivot add them in another array*/
		int arr[] = {64, 25, 12, 22, 11,0,12,1,100,2,600,2000000000};
		//int arr[] = {64, 25,1,100,-1};
		arr=quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	private static int[] quickSort(int[] a1,int start,int end) {
		
		if(start<end) {
			int loc=partition(a1, start, end);
			quickSort(a1, start, loc-1);
			quickSort(a1, loc+1, end);
		}
		
		return a1;
	}
	
	private static int partition(int[] a1,int start,int end) {
		int lb=start;
		int ub=end;
		int pivot=a1[lb];
		while(lb<ub && lb<a1.length && ub>=0) {
			while(a1[lb]<=pivot) {
				lb++;
			}
			while(a1[ub]>pivot) {
				ub--;
			}
			if(lb<ub) {
				swap(a1, lb, ub);
			}	
		}
		swap(a1, start, ub);
		return end;
	}
	
	private static void swap(int[] a1,int start,int end) {
		int temp=a1[start];
		a1[start]=a1[end];
		a1[end]=temp;
	}
}
