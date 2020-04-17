package week_2;

import java.util.Stack;

public class day2 {
  public boolean backspaceCompare(String S, String T) {
    return transform(S).equals(transform(T));
  }

  private String transform(String str) {
    Stack<Character> stack = new Stack();

    for(char c : str.toCharArray()) {
      if(c != '#') {
        stack.push(c);
      } else if(!stack.isEmpty()) {
        stack.pop();
      }
    }
    return String.valueOf(stack);
  }
}


/*
Approach 1: Build string using stack
    - Create a stack of characters
    - Iterate through string
        - if current character is not '#'
            push in stack
        - else if stack is not empty
            pop from the stack

*/
