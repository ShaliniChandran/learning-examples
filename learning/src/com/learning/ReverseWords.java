package com.learning;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println("Enter the input string: ");
		Scanner s = new Scanner(System.in);
		String inputStr = "";
		inputStr+=s.nextLine();
		inputStr = inputStr.trim();
		String outputStr = reverseWords(inputStr);
		System.out.println("word:" +outputStr);
	}

	private static String reverseWords(String inputStr) {
		String[] strings =inputStr.split(" ");
		StringBuilder sb = new StringBuilder();
		List<String> list = Arrays.asList(strings);
		for(int i=list.size() - 1 ;i>=0;i--) {
			if (!list.get(i).isEmpty()) {
			sb.append(list.get(i));
			sb.append(" ");			
			//System.out.println(sb.toString());
			}
		}
		
		return sb.toString().trim();
	}

}
