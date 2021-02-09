package com.learning;

import java.util.Scanner;

public class Palindrome {
	public boolean isPalindrome(int x) {
		long res =0;
		if (x < 0) {
			System.out.println("Negative number is not a palindrome");
			return false;
		}
		int temp = x;
		while(temp >0) {
			res = res *10 + temp%10;
			temp=temp/10;

		}
		System.out.println("Original num::" + x);
		System.out.println("Reversed num::" + res);
		if (res == x) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n;
		boolean res;
		Palindrome pl = new Palindrome();
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		res = pl.isPalindrome(n);
		System.out.println("Result is : " + res);

	}

}
