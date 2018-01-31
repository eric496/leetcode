/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] maxRob = new int[nums.length+1];
        maxRob[0] = 0;
        maxRob[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            maxRob[i] = Math.max(maxRob[i-1], maxRob[i-2]+nums[i-1]);
        }
        return maxRob[nums.length];
    }
}
