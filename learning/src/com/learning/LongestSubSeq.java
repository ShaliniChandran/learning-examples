package com.learning;

public class LongestSubSeq {

	public static void main(String[] args) {
		String array1 = "ABCDEF", array2 = "AEDNEK";
		int result = 0;
		result = subSeq(array1,array2);
		System.out.println("The longest subsequence length is ::" +result);
	}

	private static int subSeq(String array1, String array2) {
		int m = array1.length(),n = array2.length();
		int [][] matrix = new int[m+1][n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(array1.charAt(i-1) ==  array2.charAt(j-1)) {
					matrix[i][j] = matrix[i-1][j-1] +1;
					
				}else {
					matrix[i][j] = Integer.max(matrix[i-1][j] , matrix[i][j-1]);
				}
			}
		}
		return matrix[m][n];
	}

}
