package com.learning;

public class SortNum {
	public static void sort(int[] arr) {
		int low =0,mid = 0;
		int high = arr.length - 1;
		while (mid <=high) {
			if(arr[mid] == 0) {
				swap(arr,low,mid);
				++low;
				++mid;
			}
			else if(arr[mid] == 2) {
				swap(arr,mid,high);
				--high;
				
			}
			else
				++mid;
		}
		System.out.println("Final array is :");
		for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

	private static void swap(int[] arr, int low, int mid) {
		int temp =0;
		temp = arr[low];
		arr[low] = arr[mid];
		arr[mid] = temp;
		
		
	}

	public static void main(String[] args) {
		int array [] = {2,1,1,0,1,2,1,2,0,0,0,1};
		int size = array.length;
		int low =0;
		sort(array);

	}

}
