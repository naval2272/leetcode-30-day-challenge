package week_4;

public class day6 {
  public int maximalSquare(char[][] matrix) {
    int rows = matrix.length;
    if(rows <= 0) return 0;

    int cols = matrix[0].length;
    int[][] dpGrid = new int[rows + 1][cols + 1];
    int maxSoFar = 0;

    for(int row = 1; row <= rows; row++) {
      for(int col = 1; col <= cols; col++) {
        if(matrix[row - 1][col - 1] == '1') {
          dpGrid[row][col] = Math.min(dpGrid[row][col - 1], Math.min(dpGrid[row - 1][col], dpGrid[row - 1][col - 1])) + 1;
          maxSoFar = Math.max(maxSoFar, dpGrid[row][col]);
        }
      }
    }
    return maxSoFar * maxSoFar;
  }
}
