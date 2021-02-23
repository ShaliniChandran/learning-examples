package com.learning;

public class Stack {
	private int maxSize;
	private char[] stack;
	private int top;

	public Stack(int s) {
		maxSize = s;
		stack = new char[maxSize];
		top = -1;
	}

	public void push(char j) {
		stack[++top] = j;
	}

	public char pop() {
		return stack[top--];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public char peek() {
		if (!isEmpty())
			return stack[top];
		else
			System.exit(1);
		return 0;

	}
}
