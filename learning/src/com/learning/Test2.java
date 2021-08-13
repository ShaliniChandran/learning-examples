package com.learning;

public class Test2 {

	public static void main(String[] args) {
		Test2 obj2 = new Test2();
		int[] arr = { 10, 11, 15, 40, 45, 60, 65, 70 };
		int start = 0;
		int end = arr.length;
		int mid = (start + end) / 2;
		int element = 65;
		obj2.findElement(arr, start, end, element);
	}

	private void findElement(int[] arr, int start, int end, int element) {
		int mid = (start + end) / 2;
		if (start > end)
			return;
		if (arr[mid] == element) {
			System.out.println("Element found at index :" + mid);
		} else if (arr[mid] > element) {
			end = mid - 1;
			findElement(arr, start, end, element);
		} else {
			start = mid + 1;
			findElement(arr, start, end, element);
		}
	}

}

/*
 * {1,2,3,4,5}
 * 
 */