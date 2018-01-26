/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

More practice:
    If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return Integer.MIN_VALUE;
        int maxSofar = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSofar = Math.max(maxSofar+nums[i], nums[i]);
            max = Math.max(max, maxSofar);
        }
        return max;
    }
}
