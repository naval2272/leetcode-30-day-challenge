package week_4;

public class day1 {
  /*
   This is a typical brute-force approach to solve this problem
   */
  public int subarraySum(int[] nums, int k) {
    int count = 0;

    for(int start = 0; start < nums.length; start++) {
      int sum = 0;

      for(int pivot = start; pivot < nums.length; pivot++) {
        sum += nums[pivot];

        if(sum == k) {
          count++;
        }
      }
    }
    return count;
  }
}
