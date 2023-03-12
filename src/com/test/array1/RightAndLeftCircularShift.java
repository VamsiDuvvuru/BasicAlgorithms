package com.test.array1;

import java.util.Arrays;

public class RightAndLeftCircularShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int a1[]={1,2};
		arr=rightCircularshift(arr, a1[0]);
		System.out.println(Arrays.toString(arr));
		arr=leftCircularShift(arr, a1[1]);
		System.out.println(Arrays.toString(arr));
       
	}
	
	static int[] rightCircularshift(int[] a,int k) {
		int[] right=new int[a.length];
		int j=0;
		for (int i = a.length-1; k>0; i--) {
			k--;	
			right[j]=a[i];
			j++;
		}
		int temp=j;
		for(int i=0;i<=temp;i++) {		
			right[j]=a[i];
			j++;
		}
		return right;
	}
	
	static int[] leftCircularShift(int[] a,int k) {
		int left[]=new int[a.length];
		int j=a.length-1;
		for (int i = 0; i < k; i++) {
			left[j]=a[i];
			j--;
		}
		int temp=j;
		for(int i=0;i<=temp;i++) {
			left[i]=a[j];
			j++;
		}
		return left;
	}

}
