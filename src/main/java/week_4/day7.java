package week_4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class day7 {

}
class FirstUnique {
  /* Brute-force approach:
    List<Integer> numsList = new LinkedList<>();

    public FirstUnique(int[] nums) {
        for(int num: nums) {
            this.numsList.add(num);
        }
    }

    public int showFirstUnique() {
        for(int i = 0; i < numsList.size(); i++) {
            if(isUnique(numsList.get(i), i)) {
                return numsList.get(i);
            }
        }
        return -1;
    }

    public void add(int value) {
        numsList.add(value);
    }

    private boolean isUnique(int num, int index) {
        for(int i = 0; i < numsList.size(); i++) {
            if(num == numsList.get(i) && index != i) {
                return false;
            }
        }
        return true;
    }
    */

  // using hashmap and queue
  Map<Integer, Integer> freq = new HashMap();
  Queue<Integer> queue = new LinkedList();

  public FirstUnique(int[] nums) {
    for(int num: nums) {
      // Init map with numbers and respective frequencies
      freq.put(num, freq.getOrDefault(num, 0) + 1);
      // Init queue with the numbers
      queue.offer(num);
    }
  }

  public int showFirstUnique() {
    // Iterate through queue until reach the end of queue or get an element with freq = 1
    while(!queue.isEmpty() && freq.get(queue.element()) > 1) {
      queue.remove();
    }
    if(queue.isEmpty()) {
      return -1;
    }
    return queue.element();
  }

  public void add(int value) {
    // Update frequency map and add the number to queue if the number is unique
    freq.put(value, freq.getOrDefault(value, 0) + 1);
    if(freq.get(value) == 1) {
      queue.offer(value);
    }
  }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
