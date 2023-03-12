package com.test.math;

public class Math1 {
    
	//sieve of eratostheness
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=125;
        printAllPrimeNumbers(n);
	}
	
	public static void printAllPrimeNumbers(int n) {
		if(n==2) System.out.println(2);
		else if(n==3) System.out.println(3);
		else 
			for(int i=5;i*i<=n;i=i+6) {
				System.out.println((i)+"");
				System.out.println((i+2)+"");
			}
	}

}
