package week_3;

public class day4 {
  // Approach 1: recursion
  /*
    public int minPathSum(int[][] grid) {
        int result = helper(grid, 0, 0);

        return result;
    }

    public int helper(int[][] grid, int row, int col) {
        // base cases
        if(row == grid.length - 1 && col == grid[0].length - 1) {
            return grid[row][col];
        }

        if(row > grid.length - 1 || col > grid[0].length - 1) {
            return Integer.MAX_VALUE;
        }

        // recursive case
        return grid[row][col] + Math.min(helper(grid, row+1, col), helper(grid, row, col+1));
    }*/

  // Approach 2: Dynamic Programming

  public int minPathSum(int[][] grid) {
    int[][] bestResultSoFar = new int[grid.length][grid[0].length];

    for(int row = grid.length - 1; row >= 0; row--) {
      for(int col = grid[0].length - 1; col >= 0; col--) {
        if(row == grid.length - 1 && col == grid[0].length - 1) {
          bestResultSoFar[row][col] = grid[row][col];
        } else if(row == grid.length - 1 && col != grid[0].length - 1) {
          bestResultSoFar[row][col] = bestResultSoFar[row][col+1] + grid[row][col];
        } else if(row != grid.length - 1 && col == grid[0].length - 1) {
          bestResultSoFar[row][col] = bestResultSoFar[row+1][col] + grid[row][col];
        } else {
          bestResultSoFar[row][col] = grid[row][col] + Math.min(bestResultSoFar[row+1][col], bestResultSoFar[row][col+1]);
        }
      }
    }
    return bestResultSoFar[0][0];
  }
}
