package week_2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class day5 {
  public int lastStoneWeight(int[] stones) {
    Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
    for(int stone : stones) {
      heap.add(stone);
    }

    while(heap.size() >= 2) {
      int stone1 = heap.poll();
      int stone2 = heap.poll();

      if(stone1 != stone2) {
        heap.add(stone1 - stone2);
      }
    }
    return heap.isEmpty() ? 0 : heap.peek();
  }
}

/*
[2,7,4,1,8,1]

1. Store all elements in priority queue
2. Pop two biggest and store the difference in PQ, until there are less than 2 elements left
*/
