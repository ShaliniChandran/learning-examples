package com.learning;

import java.util.Scanner;

public class Reverse {

	public int reverse(int x) {
		long res =0;
		while(x>0) {
			res = res *10 + x%10;
			x=x/10;

		}
		/*if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
			return 0;
		}
		else*/
			return (int)res;
		
	}

	public static void main(String[] args) {
		int n;
		int res;
		Reverse obj = new Reverse();
		System.out.println("Enter an integer");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Number" +n +"\t");
		res = obj.reverse(Math.abs(n));
		if(n<0) {
			System.out.println("" +"-" +res +"\t");
		}else
		System.out.println("" +res +"\t");
	}

}
