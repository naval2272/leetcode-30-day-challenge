package additional_questions;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
  public static int[] findTwoSum(int[] list, int sum) {
    //throw new UnsupportedOperationException("Waiting to be implemented.");
    Map<Integer, Integer> map = new HashMap<>();
    int i = 0;
    int result[] = new int[2];

    for(int num : list) {
      map.put(num, i++);
    }

    for(int num : map.keySet()) {
      if(map.containsKey(sum - num)) {
        result[0] = map.get(num);
        result[1] = map.get(sum - num);

        return result;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
    if(indices != null) {
      System.out.println(indices[0] + " " + indices[1]);
    }
  }
}
