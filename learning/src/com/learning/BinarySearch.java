package com.learning;

public class BinarySearch {
	int binary_search_rec(int A[],int key,int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = low + ((high -low)/2);
		if(A[mid]== key) {
			return mid;
		}
		if(key <A[mid]) {
			return binary_search_rec(A,key,low, mid -1);
		}
		return binary_search_rec(A,key,mid+1,high);
	}
	int binary_search(int A[],int key,int len) {
		return binary_search_rec(A,key,0,len-1);
	}
public static void main(String args[]) {
	BinarySearch bs = new BinarySearch();
	int arr[] = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
	int size = arr.length;
	int key = 2;
	System.out.println("The key :"+key + "is available at index:" +bs.binary_search(arr,key,size));
}
}
