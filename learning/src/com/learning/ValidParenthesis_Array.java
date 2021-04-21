package com.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis_Array {

	public static void main(String[] args) {
		for (;true;) {
			ValidParenthesis_Array vP = new ValidParenthesis_Array();
			System.out.println("Enter the expression : ");
			Scanner sc = new Scanner(System.in);
			String expression = sc.nextLine();
			boolean isValid = vP.isValidParenthesis(expression);
			if(isValid) System.out.println("The expression has valid parenthesis");
			else
				System.out.println("The expression has invalid parenthesis");
		}
	}

	private boolean isValidParenthesis(String expression) {
		 char[] stack = new char[expression.length()];
	        int head = 0;
	        
	        for(char c : expression.toCharArray()) {
				switch(c) {
					case '{':
					case '[':
					case '(':
						stack[head++] = c;
						break;
					case '}':
						if(head == 0 || stack[--head] != '{') return false;
						break;
					case ')':
						if(head == 0 || stack[--head] != '(') return false;
						break;
					case ']':
						if(head == 0 || stack[--head] != '[') return false;
						break;
				}
			}
			return head == 0;

		}

}

