package com.learning;

public class AdjacentDuplicates {

	public static void main(String args[]) {
		String inputString = "coder";
		removeDuplicates(inputString);
	}

	static void printStack(Stack1 s) {
		char[] arr = new char[5];
		int i=0;
		if (s.isEmpty()) {
			return;
		}
		System.out.println(s.pop()); // Pop & Print
		printStack(s);
	}

	private static void removeDuplicates(String inputString) {
		char prevVal;
		char currentVal;
		Stack1 st = new Stack1(5);
		for (int i = 0; i < 5; i++) {
			currentVal = inputString.charAt(i);
			if (i == 0 || st.isEmpty())
				st.push(currentVal);
			else {
				if (st.peek() == inputString.charAt(i)) {
					st.pop();
				} else
					st.push(currentVal);
			}
		}
		printStack(st);
	}
}

