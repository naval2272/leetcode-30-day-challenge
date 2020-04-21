package week_3;

import java.util.List;

interface BinaryMatrix {
  public int get(int x, int y);
  public List<Integer> dimensions();
};

public class day7 {
  public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
    int minSoFar = -1;
    List<Integer> dim = binaryMatrix.dimensions();
    int totalRows = dim.get(0);
    int totalCols = dim.get(1);

    int row = 0, col = totalCols - 1;
    while(row < totalRows && col >= 0) {
      if(binaryMatrix.get(row, col) == 1) {
        minSoFar = col;
        col--;
      } else {
        row++;
      }
    }
    return minSoFar;
  }
}

/*
Note: BinaryMatrix interface is not implemented. One can write their own implementation.

Approach 1: use binary search in each row and keep updating the result with least column value
- init minSoFar = Math.MAX_VALUE
- Get dimensions of matrix
    - totalRows = list.get(0)
    - totalCols = list.get(1)
- iterate through all rows
    - get first index for 1 and store in minSoFar
    - if index < minSoFar
        - update minSoFar with new value

- return minSoFar

Approach 2:
- Start from top right corner
- if value == 1
    - update the min index with col index
    - move to previous col
- else
    - move to next row
*/
