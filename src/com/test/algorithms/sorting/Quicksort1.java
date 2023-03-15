package com.test.algorithms.sorting;

import java.util.Arrays;

public class Quicksort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = { -1, 8, 0, 4, 1, 6, 2, 100, 1000,-2 };
		System.out.println("after sorting ::" + Arrays.toString(quicksort(a1, 0, a1.length)));
	}

	static int[] quicksort(int a1[], int low, int high) {
		if (low < high) {
			int ind = partition(a1, low, high);
			quicksort(a1, low, ind - 1);
			quicksort(a1, ind, high);

		}
		return a1;
	}

	private static int partition(int[] a1, int low, int high) {
		int pivot = a1[high - 1];
		int ind = low;
		for (int i = low; i < high; i++) {
			if (a1[i] < pivot) {
				swap(a1, ind, i);
				ind++;
			}
		}
		swap(a1, ind, high - 1);
		return ind + 1;
	}

	private static void swap(int[] a1, int ind, int i) {
		// TODO Auto-generated method stub
		int temp = a1[i];
		a1[i] = a1[ind];
		a1[ind] = temp;
	}

}
