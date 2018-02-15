/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:
Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/

// method 1
class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;
        // while (num > 9) is valid as well
        while (num / 10 != 0) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            // update num value by the sum of all its digits
            num = sum;
        }
        return num;
    }
}

// method 2
class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : (num%9 == 0 ? 9 : num%9);
    }
}

// method 3
class Solution {
    public int addDigits(int num) {
        return 1 + (num-1) % 9;
    }
}
