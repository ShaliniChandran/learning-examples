package com.learning;

public class Test5FindElement2DArray {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4}, {5,6,7,8}};
		int rows =2;int cols = 4;
		Test5FindElement2DArray obj = new Test5FindElement2DArray();
		obj.findVal(arr,rows,cols);

	}

	private void findVal(int[][] arr, int rows, int cols) {
		
		int start = 0;
		int i,j,value;
		int val = 8;
		int end = rows*cols - 1;
		int mid;
		while(start <= end) {
			mid = start + (end -start)/2;
			i = mid/cols;
			j = mid %cols;
			value = arr[i][j];
			if(value == val) {
				System.out.println("element present at i:" +i +"j:"+j);
				return;
			}
			else if(value < val) start = mid+1;
			else end = mid -1;
		}
		return;
	}

}



/*




*/