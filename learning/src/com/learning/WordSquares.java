package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordSquares {
	public boolean validWordSquare(List<String> words,int num) {
		char [][] matrix = new char[num][];
		int k=0;
		for(String str : words) {
			matrix[k++] = str.toCharArray();
			//System.out.println(matrix[k]);
		}
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(words.get(i).charAt(j) != words.get(j).charAt(i)) {
					return false;
				}
			}
		}
			
		return true;
        
    }
	public static void main(String[] args) {
		int no=0;
		boolean isWordSquare = false;
		WordSquares ws = new WordSquares();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		no = sc.nextInt();
		List<String> input = new ArrayList<String>(); 
		/*
		for(int i=0;i<no;i++) {
			input.add(sc.nextLine());
		}
		*/
		input.add("abcd");
		input.add("bnrt");
		input.add("crmy");
		input.add("dtye");
		isWordSquare = ws.validWordSquare(input,no);
		System.out.println("ValidWordSquare :" +isWordSquare);
	}

}
