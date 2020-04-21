package week_3;

public class day3 {
  public int numIslands(char[][] grid) {
    // Approach 1: DFS (flood fill algorithm)
        /*
         idea is to sink already visited islands
        */
    if(grid == null || grid.length == 0) return 0;

    int rows = grid.length;
    int cols = grid[0].length;
    int result = 0;

    // if(grid == null || rows == 0) return 0;

    for(int row = 0; row < rows; row++) {
      for(int col = 0; col < cols; col++) {
        if(grid[row][col] == '1') {
          result += dfs(grid, row, col);
        }
      }
    }

    return result;
  }

  private int dfs(char[][] grid, int currentRow, int currentCol) {
    if(grid == null || currentRow < 0 || currentRow >= grid.length || currentCol < 0 || currentCol >= grid[0].length || grid[currentRow][currentCol] == '0') {
      return 0;
    }

    grid[currentRow][currentCol] = '0';
    dfs(grid, currentRow - 1, currentCol);
    dfs(grid, currentRow + 1, currentCol);
    dfs(grid, currentRow, currentCol - 1);
    dfs(grid, currentRow, currentCol + 1);

    return 1;
  }
}

/*

    11110
    11010
    11000
    00000

    01110
    11010
    11000
    00000


*/
