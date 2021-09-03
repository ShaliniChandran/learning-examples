package com.learning;

import java.util.ArrayList;
import java.util.List;

public class ReverseStrings {

	public static void main(String[] args) {
		String testString = "Algo   is the best!";
		ReverseStrings rS = new ReverseStrings();
		rS.reverseStrings(testString);

	}

	private void reverseStrings(String testString) {
		List<String> words = new ArrayList<String>();
		boolean isWord = true;
		String word = "";
		for(int i=0;i< testString.length();i++) {
			char c = testString.charAt(i);
			if(c == ' ') {
				if(isWord) {
					words.add(word);
					word = "";
					isWord = false;
				}
			}
			else {
				if
				(!isWord) {
					isWord = true;
					words.add(word);
					word = "";
					
				}
			}
			word += c;
		}
		words.add(word);
		String returnStr = "";
		for(int i = words.size() - 1; i >= 0; i--){
		      returnStr += words.get(i);
		    }
		System.out.println("Word = " + returnStr);
	}

}

/*
string = "Algo is the best!"
"best! is the Algo"
*/