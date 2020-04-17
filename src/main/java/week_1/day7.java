package week_1;

import java.util.HashMap;
import java.util.Map;

public class day7 {
  public int countElements(int[] arr) {

    /*
        - Initialize result to 0
        - Create a map to store numbers and their frequencies
        - Iterate through map keys
            - if map contains (key + 1)
                - result = result + freq of key
        - return result
    */

    int result = 0;
    Map<Integer, Integer> freq = new HashMap();

    for(int num : arr) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    for(int key : freq.keySet()) {
      if(freq.containsKey(key + 1)) {
        result += freq.get(key);
      }
    }
    return result;
  }
}
