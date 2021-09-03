package com.learning;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bS = new BubbleSort();
		int arr[] = {8,5,2,9,5,6,3};
		int resArr[] = bS.bubbleSort(arr);
		for(int res :resArr) {
			System.out.println(res);
		}
	}

	private int[] bubbleSort(int[] arr) {
		int ctr =0;
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int i=0;i<arr.length -1 -ctr;i++) {
				int temp = 0;
				if(arr[i] > arr[i+1]) {
					isSorted = false;
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				
			}
			ctr ++;
		}
		return arr;
	}

}
