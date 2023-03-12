package com.test.array1;

public class DeleteAnElementFromAnArray {
	
	public static void main(String[] args) {
		int[] a1= {1,2,3,0,4,5,6};
		int k=0;
		int position=searchElement(a1,k);
		a1=removeAnelement(a1, position);
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}	
	}
	
	static int[] removeAnelement(int[] a1,int k) {
		for (int i = k; i < a1.length; i++) {
			if((i+1)<a1.length) a1[i]=a1[i+1];
		}
		a1[a1.length-1]=-1;
		return a1;	
	}
	
	static int searchElement(int[] a1,int k) {
		for (int i = 0; i < a1.length; i++) {
			if(a1[i]==k) {
				return i;
			}
		}
		return -1;
		
	}

}
