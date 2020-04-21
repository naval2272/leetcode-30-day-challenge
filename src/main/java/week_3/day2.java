package week_3;

public class day2 {
  public boolean checkValidString(String s) {
    if(s.length() == 0) return true;

    int diff = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == ')') {
        diff--;
      } else {
        diff++;
      }

      if(diff < 0) return false;
    }

    if(diff == 0) return true;

    diff = 0;

    for(int i = s.length() - 1; i >= 0; i--) {
      if(s.charAt(i) == '(') {
        diff--;
      } else {
        diff++;
      }

      if(diff < 0) return false;
    }
    return true;
  }
}

/*
- Traverse left to right
    - keep running count of opening and closing parenthesis
    - if there is extra closing parenthesis, return false
- Traverse right to left
    - keep running count of opening and closing parenthesis
    - if there is extra opening parenthesis, return false
- return true
*/
