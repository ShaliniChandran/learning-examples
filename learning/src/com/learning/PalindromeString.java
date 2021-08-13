package com.learning;

public class PalindromeString {

	public static void main(String[] args) {
		PalindromeString PS = new PalindromeString();
		String name = "Tree";
		boolean isPal = true;
		isPal = PS.checkPalindrome(name);
		System.out.println("Result is :" +isPal);

	}

	boolean checkPalindrome(String name) {
		boolean res = true;
		int len = name.length();
		int i =0;
		int j = len -1;
		while(i< len/2) {
			if(name.charAt(i) == name.charAt(j)) {
				i++;
				j--;
				continue;
			}
			else
				res = false;
			i++;
			j--;
		}
		return res;
	}

}
