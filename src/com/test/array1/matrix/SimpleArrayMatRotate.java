package com.test.array1.matrix;

import java.util.Arrays;

public class SimpleArrayMatRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		 //rotateMatrix(a1);

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		//rotateMatrix(a);

		int a2[][] = { { 1, 2 }, { 3, 4 } };
		 rotateMatrix(a2);

		int a3[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		// rotateMatrix(a3);

	}

	static void rotateMatrix(int[][] a1) {
		int temp = a1[0][0];
		// top Elements rotate
		for (int j = 0; j < a1[0].length; j++) {
			if ((j + 1) < a1[0].length) {
				int temp2 = 0;
				temp2 = a1[0][j + 1];
				a1[0][j + 1] = temp;
				temp = temp2;
			}
		}

		// last column rotate
		for (int i = 1; i < a1.length; i++) {
			int ele = a1[i][a1[i].length - 1];
			a1[i][a1[i].length - 1] = temp;
			temp = ele;
		}

		// last row rotate
		for (int i = a1[a1.length - 1].length - 2; i >= 0; i--) {
			int ele = a1[a1.length - 1][i];
			a1[a1.length - 1][i] = temp;
			temp = ele;
		}

		// first column rotate
		for (int i = a1.length - 2; i >= 0; i--) {
			int ele = a1[i][0];
			a1[i][0] = temp;
			temp = ele;
		}
		int tArray[][] = new int[a1.length - 2][a1[0].length - 2];
		int tArrayIndex = 0;
		// if array is not 2D or 2D array
		boolean FourDArray=false;
		for (int i = 1; i < a1.length - 1; i++) {
			int[] tempArray = new int[a1[i].length - 2];
			int tempArrayIndex = 0;
			if (a1[i].length - 2 > 1) {
				FourDArray=true;
				System.out.println("not a 2D or 3D Array");
				for (int j = 1; j <= a1[i].length - 2; j++) {
					tempArray[tempArrayIndex++] = a1[i][j];
				}
				tArray[tArrayIndex++] = tempArray;
			} else {
				System.out.println("Its a 2D or 3D Array");
			}

		}
		if(FourDArray) {
			rotateMatrix(tArray);
			//populating elements again in the main array
			int t1=0;
			for(int i=1;i<a1.length-1;i++) {
				int t11=0;
				for(int j=1;j<a1[i].length-1;j++) {
					int t=tArray[t1][t11];
					a1[i][j]=tArray[t1][t11];
					t11++;
				}
				t1++;
			}
		}
		
		
		
	}

}
