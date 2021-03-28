package com.learning;

public class MatrixCountPath {
public static void main(String args[]) {
	int m=6;
	int n=6;
	int [][] matrix = new int [6][6];
	for(int i=0;i<m;i++) {
		matrix[i][0]=1;
	}
	for(int j=0;j<n;j++) {
		matrix[0][j]=1;
	}
	for(int i=1;i<m;i++) {
		for(int j=1;j<n;j++) {
			matrix[i][j] = matrix[i-1][j]+matrix[i][j-1];
			if((i==m-1) && (j==n-1)) {
				System.out.println(matrix[i][j]);
			}
		}
	}
	
}
}
