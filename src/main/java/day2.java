import java.util.HashSet;

public class day2 {
  public boolean isHappy(int n) {
    // Use hashset to check cycle condition
    HashSet<Integer> seen = new HashSet();

    // Loop until number becomes 1
    while(n != 1) {
      int sum = 0;
      // Get sum of the digits
      while(n != 0) {
        sum = sum + (n % 10) * (n % 10);
        n = n / 10;
      }

      // Check cycle-condition
      if(seen.contains(sum)) {
        return false;
      }

      // Add the sum to the set
      seen.add(sum);
      n = sum;
    }
    return true;
  }
}
