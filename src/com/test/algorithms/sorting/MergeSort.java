package com.test.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int arr[] = { 64, 25, 12, 22, 11, 0, 12, 1, 100 };
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] a1) {
		if (a1.length == 1) {
			return a1;
		} else {
			int midPoint = a1.length / 2;
			int[] left = new int[midPoint];
			if (midPoint % 2 == 0 || midPoint == 1) {
				midPoint = midPoint;
			} else {
				midPoint = midPoint + 1;
			}
			int[] right = new int[midPoint];
			for (int i = 0; i < left.length; i++) {
				left[i] = a1[i];
			}
			for (int i = 0; i < right.length; i++) {
				right[i] = a1[i + midPoint];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			int[] result = merge(left, right);
			return result;
		}
	}

	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int leftArrInd = 0;
		int rightArrInd = 0;
		int resultArrInd = 0;
		while (leftArrInd < left.length || rightArrInd < right.length) {
			if (leftArrInd < left.length && rightArrInd < right.length) {
				if (left[leftArrInd] > right[rightArrInd]) {
					result[resultArrInd++] = left[leftArrInd++];
				} else {
					result[resultArrInd++] = right[rightArrInd++];
				}
			} else if (leftArrInd < left.length) {
				result[resultArrInd++] = left[leftArrInd++];
			} else if (rightArrInd < right.length) {
				result[resultArrInd++] = right[rightArrInd++];
			}
		}

		return result;
	}

}
