package com.test.arrangeDearange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenPositionGTNOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int arr1[]=new int[arr.length];
		boolean even=arr.length%2==0?true:false;
		List<Integer> l1=Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		
	}

}
