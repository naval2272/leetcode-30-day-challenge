package week_2;

import java.util.ArrayList;
import java.util.List;

class MinStack {

  /** initialize your data structure here. */
  List<Integer> list = new ArrayList();
  int top = -1;

  public MinStack() {
    this.top = -1;
  }

  public void push(int x) {
    list.add(x);
  }

  public void pop() {
    list.remove(list.size() - 1);
  }

  public int top() {
    int top = list.remove(list.size()-1);
    list.add(top);
    return top;
  }

  public int getMin() {
    int min = Integer.MAX_VALUE;
    for(int i : list) {
      if(min > i) {
        min = i;
      }
    }
    return min;
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class day3 {

}
