package com.learning;

import java.util.Scanner;

public class Fibanocii {

	public static void main(String[] args) {
		int n,result;
		System.out.println("Enter value for n:");
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		result = fib(n);
		System.out.println("Result is :" +result);
	}

	private static int fib(int n) {
		int res = 0;
		if(n<=1) return n;
		if(n ==2) return 1;
		int current =0;
		int prev1=1,prev2=1;
		for(int i=3;i<=n;i++) {
			current = prev1+prev2;
			prev2=prev1;
			prev1=current;
		}
		return current;
	}

}
