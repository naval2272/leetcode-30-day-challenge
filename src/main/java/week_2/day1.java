package week_2;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class day1 {
  public ListNode middleNode(ListNode head) {
    ListNode slow = head, fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}

/*
- Two pointer approach
    - increment fast pointer 2 steps at a time
    - increment slow pointer 1 step at a time
- When fast pointer reaches end of list, slow pointer would be pointing to middle of the list
 */
