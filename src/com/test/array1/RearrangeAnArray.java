package com.test.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		rearrangeArray(arr);
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(", "+arr[i]);	
		}
		
	}
	
	static void rearrangeArray(int[] a1) {
		List<Integer> l1=Arrays.stream(a1).boxed().collect(Collectors.toList());
		System.out.println(l1.toString());
       for(int i=0;i<a1.length;i++) {
    	   if(a1[i]!=i) {
    		   if(l1.contains(i)) {
    			   a1[i]=i;
    		   }else{
    			  a1[i]=-1;
    		   }
    	   }
       }
	}

}
