package com.test.array1;

import java.util.ArrayList;
import java.util.List;

public class InsertAnElementAtAnyPosition {
	public static void main(String[] args) {
		int[] a1= {1,2,3,5,6};
		int k=4;
		int p=2;
		try {
			a1=insertingElement(a1,k,p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		
	}
	static int[] insertingElement(int[] a1,int k,int p) throws Exception{
		int val=0;
		List<Integer> l1= new ArrayList<>();
		for (int i = 0; i < a1.length; i++) {
			if(i==p) {
				l1.add(k);
				l1.add(a1[i]);
			}else {
				l1.add(a1[i]);
			}
		}
		System.out.println(l1);
		return a1;
	}

}
