  package com.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		for (;true;) {
			ValidParenthesis vP = new ValidParenthesis();
			System.out.println("Enter the expression : ");
			Scanner sc = new Scanner(System.in);
			String expression = sc.nextLine();
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < expression.length(); i++) {
				System.out.println(expression.charAt(i));
				stack.push(expression.charAt(i));
			}

			vP.isValidParenthesis(stack, expression);
		}
	}

	private void isValidParenthesis(Stack<Character> stack, String expression) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		int length = stack.size();
		
		while (length > 0) {
			int ctr = 0;
			if (map.containsKey(stack.peek())) {
				Character bracket1 = stack.pop();
				Character bracket2 = map.get(bracket1);
				length--;
				for (int i = 0; i < expression.length(); i++) {
					if (bracket2.equals(expression.charAt(i)))
						ctr++;
				}
				if (ctr == 0) {
					System.out.println("The expression contains invalid parenthesis");
					return;
				}else {
					continue;
				}
			} else {
				stack.pop();
				length--;
			}
		}
		
		System.out.println("The expression contains valid parenthesis");

	}

}

