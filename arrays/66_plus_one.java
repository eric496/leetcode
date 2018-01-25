/*
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return digits;
        int sum = 0, carry = 1;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = digits.length-1; i >= 0; i--) {
            sum = digits[i] + carry;
            result.add(0, sum%10);
            carry = sum / 10;
        }
        if (carry != 0) {
            result.add(0, carry);
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
