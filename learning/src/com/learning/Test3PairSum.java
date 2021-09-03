package com.learning;

public class Test3 {

	public static void main(String[] args) {
		Test3 obj = new Test3();
		int[] arr = { 1, 2, 3, 4, 5 };
		int target = 5;
		obj.findPair(arr, target);

	}

	private void findPair(int[] arr, int target) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;

		num1 = 0;
		num2 = arr.length - 1;
		
		while (num1 < num2) {
			sum = arr[num1] + arr[num2];
			if (sum == target) {
				System.out.println("{" + arr[num1] + "," + arr[num2] + "}");
				num2 --;
			} else if (sum > target) {
				num2--;
			} else if (sum < target) {
				num1++;
			}
		}
	}

}
