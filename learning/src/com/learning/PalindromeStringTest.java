package com.learning;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeStringTest {
	@Test
	public void checkPalindromeTest() {
		PalindromeString PS = new PalindromeString();
		String input = "Free";
		boolean expected = true;
		boolean actual = PS.checkPalindrome(input);
		assertTrue(expected == actual);
	}
	public static void main(String[] args) {
		PalindromeStringTest PST = new PalindromeStringTest();
		PST.checkPalindromeTest();
	}

}
