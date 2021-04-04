package com.learning;

import java.util.Scanner;

public class MaxSeats {
	
	public int maxStudents(char[][] seats,int m,int n) {
		int ctr = 0;
		for(int j=0;j+1 <n;j++) {
			for(int i=0;i<m;i++) {
				if(j==0) {
					if(seats[i][0] == '.') {
						seats[i][0] = 'O';
						ctr++;
					}
				}else {
					if(i==0) {
						if(seats[0][j] != '#' && seats[0][j-1] != 'O' && seats[0][j+1]!='O' && seats[1][j-1] != 'O' && seats[1][j+1] !='O') {
							seats[0][j] = 'O';
									ctr++;
						}
					}else {
						
						if(seats[i][j] != '#' && seats[i][j-1] != 'O' && seats[i][j+1]!='O' && seats[i-1][j-1] != 'O' && seats[i-1][j+1] !='O') {
							seats[0][j] = 'O';
									ctr++;
						}
						
					}
				}
			}
		}
		return ctr + 1;
		
        
    }

	public static void main(String[] args) {
		int m, n ,result;
		MaxSeats obj = new MaxSeats();
		System.out.println("Please enter the number of rows and columns");
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		char[][] seats = new char[m][n];
		System.out.println("Enter the input array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				seats[i][j] = s.next().charAt(0);
			}
		}
		result = obj.maxStudents(seats,m,n);
		System.out.println("Max no of students :" +result);

	}

}
