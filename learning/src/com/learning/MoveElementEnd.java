package com.learning;


public class MoveElementEnd {

	public static void main(String[] args) {
		int arr[] = {2,1,2,2,2,3,4,2};
		int toMove = 2;
		MoveElementEnd mObj = new MoveElementEnd();
		mObj.moveEle(arr,toMove);

	}

	private  void moveEle(int[] arr,int toMove) {
		int i=0;
		int j = arr.length -1;
		while(i<j) {
			int temp =0;
			while ((i<j) && arr[j] == toMove)
				j--;
			while((i<j) && arr[i] == toMove) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			i++;
			
		}
		System.out.println("Final array:");
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}

}
