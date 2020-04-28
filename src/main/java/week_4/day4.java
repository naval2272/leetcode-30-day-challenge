package week_4;

public class day4 {
  int[] memo; // 0 - unknown, 1 - good, 2 - bad

  public boolean canJump(int[] nums) {
    memo = new int[nums.length];
    memo[memo.length - 1] = 1;

    return canJumpHelper(0, nums);
  }

  private boolean canJumpHelper(int position, int[] nums) {
    // base case
        /* Get rid of recursive step and use memo instead
        if(position == nums.length - 1) {
            return true;
        }*/
    if(memo[position] != 0) {
      return memo[position] == 1 ? true : false;
    }

    int furthestJump = Math.min(position + nums[position], nums.length - 1);

    for(int i = position + 1; i <= furthestJump; i++) {
      if(canJumpHelper(i, nums)) {
        memo[position] = 1;
        return true;
      }
    }

    memo[position] = 2;

    return false;
  }
}

/*
[2,3,1,1,4]
// check jump from an index to all possible indexes
// if any of the target index is end of array, return true
// recurse until end of array is reached

*/
