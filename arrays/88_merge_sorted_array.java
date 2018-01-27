/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
    You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) return;
        if (nums2 == null || nums2.length == 0) return;
        int ix = m + n - 1, ix1 = m - 1, ix2 = n - 1; 
        while (ix1 >= 0 || ix2 >= 0) {
            if (ix1 >= 0 && ix2 >= 0) {
                if (nums1[ix1] > nums2[ix2]) {
                    nums1[ix--] = nums1[ix1--];
                } else {
                    nums1[ix--] = nums2[ix2--];
                }
            } else if (ix1 >= 0) {
                nums1[ix--] = nums1[ix1--];
            } else if (n >= 0) {
                nums1[ix--] = nums2[ix2--];
            }
        }
    }
}
