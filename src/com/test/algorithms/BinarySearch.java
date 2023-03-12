package com.test.algorithms;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] a1= {5,1,2,3,9};
		for (int i = 0; i < a1.length; i++) {
			for (int j = i+1; j < a1.length; j++) {
				if(a1[i]>a1[j]) {
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		System.out.println("sorted array ::"+Arrays.toString(a1));
		System.out.println(binarySearch(a1, 0, a1.length, 2));
	}
	
	static int binarySearch(int[] a1,int start,int end,int val) {
		System.out.println("start ::"+start+" end ::"+end);
		   if(end<start)return -1;
			int mid=start+end/2;
			System.out.println("mid :"+mid);
			if(mid<a1.length) {
				if(a1[mid]==val) {
					return mid;
				}else if(a1[mid]>val) {
					return binarySearch(a1, start, mid-1, val);
				}else {
					return binarySearch(a1, mid, end, val);
				}
			}else {
				return -1;
			}
			
		
	}

}
