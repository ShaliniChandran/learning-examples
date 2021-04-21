package com.learning;

public class NoOfIslands {

	public int numIslands(char[][] grid) {
		int rows = grid.length;
		if(rows == 0) return 0;
		int cols = grid[0].length;
		int no_of_islands = 0;
		for(int i=0;i<rows;++i) {
			for(int j=0;j<cols;++j) {
				if(grid[i][j] == '1') {
					mark_current_island(grid,i,j,rows,cols);
					no_of_islands +=1;
				}
			}
		}
		return no_of_islands;

	}

	private void mark_current_island(char[][] grid, int x, int y, int rows, int cols) {
		// Boundary condition
		if(x<0 || x>= rows || y<0 || y>=cols || grid[x][y] != '1')
			return;
		//mark current cell as visited
		grid[x][y] = '2';
		
		//make recursive call in all 4 directions
		
		mark_current_island(grid,x+1,y,rows,cols);
		mark_current_island(grid,x,y+1,rows,cols);
		mark_current_island(grid,x-1,y,rows,cols);
		mark_current_island(grid,x,y-1,rows,cols);
	}

	public static void main(String[] args) {
		NoOfIslands NI = new NoOfIslands();
		int number = 0;
		char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' }

		};
		number = NI.numIslands(grid);
		System.out.println("The no of islands is : " +number);
	}

}
