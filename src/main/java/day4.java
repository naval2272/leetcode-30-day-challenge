public class day4 {
  public void moveZeroes(int[] nums) {
    // Approach 1

    int index = 0;
    // Iterate through the array
    for(int i = 0; i < nums.length; i++) {
      // If number is non-zero, store in current index and increment the index
      // This way pointer will reach the index from where we need to fill 0s
      if(nums[i] != 0) nums[index++] = nums[i];
    }

    // Start from the new index from where we need to initialize array with 0s
    for(int i = index; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
