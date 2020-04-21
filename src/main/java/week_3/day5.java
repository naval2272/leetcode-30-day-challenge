package week_3;

public class day5 {
  /*
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        // Get the peak value and its index
        int peakIndex = getPeakIndex(nums);
        //int peakValue = nums[peakIndex];
        int targetIndex = 0;
        System.out.println(peakIndex);

        // Search in first half if target is greater than element in 0-th index
        if(target >= nums[0]) {
            int low = 0, high = peakIndex;
            targetIndex = binarySearch(nums, low, high, target);
        }
        // Else search in second half
        else {
            int low = peakIndex, high = nums.length - 1;
            targetIndex = binarySearch(nums, low, high, target);
        }
        return targetIndex;
    }

    private int getPeakIndex(int[] nums) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            } else if(nums[mid] < nums[mid+1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    */

  public int search(int[] nums, int target) {
    int lowerBound = 0;
    int upperBound = nums.length - 1;

    while(lowerBound <= upperBound) {
      int mid = lowerBound + (upperBound - lowerBound)/2;
      if(nums[mid] == target) return mid;

      // first half is sorted
      if(nums[lowerBound] <= nums[mid]) {
        if(nums[lowerBound] <= target && target < nums[mid]) {
          upperBound = mid - 1;
        } else {
          lowerBound = mid + 1;
        }
      }
      // second half is sorted
      else {
        if(nums[mid] < target && target <= nums[upperBound]) {
          lowerBound = mid + 1;
        } else {
          upperBound = mid - 1;
        }
      }
    }
    return -1;
  }
}
