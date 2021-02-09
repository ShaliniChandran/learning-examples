package com.learning;

public class LargestNum {

	private static int findMaxNum(int arr[], int start, int end) {
		if (start == end) {
			return arr[start];
		}
		if (end == start + 1) {
			if (arr[start] > arr[end])
				return arr[start];
			else
				return arr[end];

		}
		int mid = (start + end) / 2;
		if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
			return arr[mid];
		if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
			return findMaxNum(arr, start, mid - 1);
		} else {
			return findMaxNum(arr, mid + 1, end);
		}

	}

	public static void main(String[] args) {
		int array[] = { 6, 9, 15, 25, 35, 50, 41, 29, 23, 8 };
		int size = 10;
		int start = 0, end = 9;
		int result = findMaxNum(array, start, end);
		System.out.println("The largest number is :" + result);

	}

}
