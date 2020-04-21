package week_3;

public class day1 {
  public int[] productExceptSelf(int[] nums) {
    // Approach 1
        /*int length = nums.length;
        // create an array of the same length as input array
        int[] finalArray = new int[length];
        // iterate through the array and store product of all elements to the left

        finalArray[0] = 1;
        for(int i = 1; i < length; i++) {
            finalArray[i] = nums[i-1] * finalArray[i-1];
        }

        int productToRight = 1;
        for(int i = length - 1; i >= 0; i--) {
            finalArray[i] = finalArray[i] * productToRight;
            productToRight = productToRight * nums[i];
        }

        return finalArray;
        */

    // Approach 2: store product to left in one array and product to right in another
    int[] toLeft = new int[nums.length];
    int[] toRight = new int[nums.length];
    toLeft[0] = 1;
    toRight[nums.length - 1] = 1;

    for(int i = 1; i < nums.length; i++) {
      toLeft[i] = toLeft[i-1] * nums[i-1];
    }

    for(int i = nums.length - 2; i >= 0; i--) {
      toRight[i] = toRight[i+1] * nums[i+1];
    }

    for(int i = 0; i < nums.length; i++) {
      nums[i] = toLeft[i] * toRight[i];
    }

    return nums;
  }
}

/*
[1,2,3,4]
[1,1,2,6]
[     ,6]



[1,2,3,4]
left --> [1,1,2,6]
right--> [24,12,4,1]
final -->[24,12,8,6]
*/
