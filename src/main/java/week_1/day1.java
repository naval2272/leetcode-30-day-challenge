package week_1;

import java.util.HashMap;

public class day1 {
  public int singleNumber1(int[] nums) {
    int sum = 0;
    for(int i : nums) {
      sum = sum ^ i;
    }
    return sum;
  }

  public int singleNumber2(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap();
    for(int i : nums) {
        if(!map.containsKey(i)) {
          map.put(i, 1);
    } else {
      map.put(i, map.get(i) + 1);
    }
    }

    for(Integer key : map.keySet()) {
      if(map.get(key) == 1) return key;
    }

    return -1;
  }
}
