/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion? 
*/

// method 1 using loop
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}

// method 2 without loop
class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19, 3^20 is greater than Integer.MAX_VALUE
        return n > 0 && 1162261467 % n == 0;
    }
}
