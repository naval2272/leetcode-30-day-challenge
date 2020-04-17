package week_2;

public class day7 {
  public String stringShift(String s, int[][] shift) {
    int totalShift = getTotalShift(shift);
    String stringAfterShift = performShift(s, totalShift);

    return stringAfterShift;
  }

  private int getTotalShift(int[][] shift) {
    int total = 0;
    for(int row = 0; row < shift.length; row++) {
      if(shift[row][0] == 0) {
        int temp = shift[row][1] * -1;
        total += temp;
      } else {
        int temp = shift[row][1] * 1;
        total += temp;
      }
    }
    return total;
  }

  private String performShift(String input, int shiftCount) {
    if(shiftCount == 0) {
      return input;
    }
    else if(shiftCount < 0) {
      shiftCount = shiftCount * -1;   // convert index to positive
      shiftCount = shiftCount % input.length();
      return input.substring(shiftCount) + input.substring(0, shiftCount);
    } else {
      shiftCount = shiftCount % input.length();
      return input.substring(input.length() - shiftCount) + input.substring(0, input.length() - shiftCount);
    }
  }
}

/*
- Calculate total shift
    - iterate through shift array
        - if left --> -1 * amount
        - if right --> 1 * amount
- Perform shift operation
    - if shift operations < 0 --> left shift
    - else --> right shift
*/
