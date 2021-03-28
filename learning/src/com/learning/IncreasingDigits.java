package com.learning;

import java.util.Scanner;

public class IncreasingDigits {

	public int monotoneIncreasingDigits(int num) {
		int res = 0, result = 0, val = 0;

		for (int i = num; i > 0; i--) {
			int remainder1 = i;
			int remainder2 = i;
			int lenRem = 0;
			while (remainder1 != 0) {
				remainder1 /= 10;
				++lenRem;
			}
			int[] arr = new int[lenRem];
			while (remainder2 > 0) {
				res = remainder2 % 10;
				remainder2 = remainder2 / 10;
				if (lenRem >= 1) {
					arr[lenRem - 1] = res;
					lenRem--;
				}

			}
			int ctr = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					ctr++;
				} else
					continue;
			}

			if (ctr > 0)
				continue;
			else {
				val = i;

				break;
			}
		}
		result = val;
		return result;
	}

	public static void main(String[] args) {
		IncreasingDigits Id = new IncreasingDigits();
		System.out.println("Enter the number");
		int num, res;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		res = Id.monotoneIncreasingDigits(num);
		System.out.println("result is ::" + res);
	}

}
