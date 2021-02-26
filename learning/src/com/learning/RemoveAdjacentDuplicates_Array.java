package com.learning;

public class RemoveAdjacentDuplicates_Array {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("aabbcddce");
		printArray(removeAdjacentDuplicates("aabbcddce"));
		System.out.println("kappa");
		printArray(removeAdjacentDuplicates("kappa"));
		System.out.println("malayalam");
		printArray(removeAdjacentDuplicates("malayalam"));
		System.out.println("raberreber");
		printArray(removeAdjacentDuplicates("raberreber"));
		System.out.println("coder");
		printArray(removeAdjacentDuplicates("coder"));
		
	}

	private static void printArray(char[] array) {
//		System.out.println("In printArray");
		System.out.println(new String(array).toString());
		
	}

	private static char[] removeAdjacentDuplicates(String string) {
		char[] stack = new char[string.length()];
		char[] copiedArray =  new char[string.length()];
		int stackSize = 0;
		int peek = 0;
		while(peek < string.length()) {
			char nextChar = string.charAt(peek);//peek
			if(stackSize > 0) {
				char adjacentChar = stack[stackSize - 1];
				if(adjacentChar == nextChar) {
					stack[stackSize - 1] = '\n';//pop
					stackSize--;
				}
				else {
					stack[stackSize] = nextChar;//push
					stackSize++;
				}
			}
			else {
				stack[stackSize] = nextChar;//push
				stackSize++;
			}
			peek++;
			
		}
		int stackPos = 0;
		while(stackPos < stackSize) {
			copiedArray[stackPos] = stack[stackPos];
			stackPos++;
		}
		return copiedArray;
	}

}
