package com.learning;

import java.util.HashMap;
import java.util.Scanner;

public class Roman {

	public int romanToInt(String s) {
		HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>() {
			{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}
		};
		int total = 0,currentInt=0,nextInt=0;
		if(s.length() == 1) {
			total += romanMap.get(s.charAt(0));
		}
		for(int i=0;i<s.length() -1;i++) {
			currentInt = romanMap.get(s.charAt(i));
			nextInt = romanMap.get(s.charAt(i+1));
				if(currentInt >= nextInt) {
					total+= currentInt;
					
				}else {
					total += nextInt - currentInt;
					i++;
				}
				if((i+1) == (s.length()-1)) {
					total += romanMap.get(s.charAt(i+1));
				}
		}

		
		return total;

	}

	public static void main(String[] args) {
		String romanNumeral;
		Roman rn = new Roman();
		int result;
		System.out.println("Enter the Roman numeral:");
		Scanner s = new Scanner(System.in);
		romanNumeral = s.next();
		result = rn.romanToInt(romanNumeral);
		System.out.println("The value for Roman numeral is :" +result);
	}

}
