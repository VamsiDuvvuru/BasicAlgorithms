package com.test.array1;

import java.util.Arrays;

public class ElementAtAIndexAfterNRotations {
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int queries[][] = { {0, 3}, {3, 4} };
		int k=1;
		for (int i = 0; i < queries.length; i++) {
			int a3[]=new int[arr.length];
			int a2[]=new int[queries[i][queries[i].length-1]+1];
			for (int j = 0; j <=queries[i][queries[i].length-1]; j++) {
				a2[j]=arr[j];
			}
			a2=rotateArray(a2,k);
			for (int j = 0; j < a2.length; j++) {
				a3[j]=a2[j];
			}
			for (int j = a2.length; j < arr.length; j++) {
				a3[j]=arr[j];
			}
			System.out.println("fl::"+Arrays.toString(a3));
			arr=a3;
		}
		
		
	}
	
	static int[] rotateArray(int[] a1,int k) {
		while(k>0) {
			int val=a1[a1.length-1];
			for (int i = a1.length-1; i >=0; i--) {
				if((i-1)>=0) {
					a1[i]=a1[i-1];
				}
			}
			a1[0]=val;
			k--;
		}
		
		return a1;
	}

}
