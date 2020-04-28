package week_4;

public class day2 {
  public int rangeBitwiseAnd(int m, int n) {
    while(m < n) {
      n = n & (n - 1);
    }
    return m & n;
  }
}
