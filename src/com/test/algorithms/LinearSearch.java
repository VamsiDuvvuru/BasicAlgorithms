package com.test.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LinearSearch {
	
	public static void main(String[] args) {
		Integer[] a1= {5,1,2,3,9};
		 int val=90;
		List<Integer> l1=Arrays.asList(a1).stream().collect(Collectors.toList());
		
		boolean available=l1.stream().anyMatch(x->x==val);
		System.out.println(available);
		
		boolean available2=l1.stream().allMatch(x->x==val);
		System.out.println(available2);
		
		int available3=l1.stream().findAny().get();
		System.out.println(available3);
		
		int available4=l1.stream().findFirst().get();
		System.out.println(available4);
//		
//	    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
//	    
//	    // Stream anyMatch(Predicate predicate) 
//	    boolean answer = list.stream().anyMatch(n
//	                     -> (n * (n + 1)) / 4 == 5);
//	      
	    // Displaying the result
	    //System.out.println(answer);

	}

}
