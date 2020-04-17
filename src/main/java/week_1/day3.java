package week_1;

public class day3 {
  public int maxSubArray(int[] nums) {
    int[] copyNums = new int[nums.length];
    int globalMax = nums[0];
    copyNums[0] = nums[0];

    for(int i = 1; i < nums.length; i++) {
      copyNums[i] = Math.max(nums[i], nums[i] + copyNums[i - 1]);
      globalMax = Math.max(globalMax, copyNums[i]);
    }
    return globalMax;
  }
}
