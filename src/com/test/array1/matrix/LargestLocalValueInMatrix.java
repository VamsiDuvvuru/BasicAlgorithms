package com.test.array1.matrix;

public class LargestLocalValueInMatrix {
	
	public static void main(String[] args) {
	   int[][] a1= {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
	   int ind=0; 
	   int pos=ind+3;
	   int count=1;
	   for(int i=0;i<a1.length;i++) {
		   for(int j=ind;j<pos &&count<=3;j++) {
			   System.out.print(a1[i][j]+" ");
		   }
		   System.out.println();
		   count++;
	   }
	}

}
