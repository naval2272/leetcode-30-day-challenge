package week_2;

import java.util.HashMap;
import java.util.Map;

public class day6 {
  public int findMaxLength(int[] nums) {
    Map<Integer, Integer> cache = new HashMap();
    cache.put(0, -1);

    int maxSoFar = 0, count = 0;
    int temp = 0;

    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 0) {
        temp = -1;
      } else {
        temp = 1;
      }

      count += temp;

      if(cache.containsKey(count)) {
        maxSoFar = Math.max(maxSoFar, i - cache.get(count));
      } else {
        cache.put(count, i);
      }
    }
    return maxSoFar;
  }
}
