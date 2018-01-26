/*
Given two binary strings, return their sum (also a binary string).

For example,
    a = "11"
    b = "1"
    Return "100".
*/

/*
Thought:
    convert integer to char
    convert string buffer to string
    StringBuffer instance method: insert() and append()
*/

class Solution {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0) return b;
        if (b == null || b.length() == 0) return a;
        StringBuffer result = new StringBuffer();
        int sum = 0, carry = 0, ixa = a.length()-1, ixb = b.length()-1;
        while (ixa >= 0 || ixb >= 0) {
            if (ixa >= 0 && ixb >= 0) {
                sum = (char)(a.charAt(ixa--)-'0') + (char)(b.charAt(ixb--)-'0') + carry;
                result.insert(0, sum%2);
                carry = sum / 2;
            } else if (ixa >= 0) {
                sum = (char) (a.charAt(ixa--)-'0') + carry;
                result.insert(0, sum%2);
                carry = sum / 2;
            } else if (ixb >= 0) {
                sum = (char) (b.charAt(ixb--)-'0') + carry;
                result.insert(0, sum%2);
                carry = sum / 2;
            }
        }
        if (carry != 0) {
            result.insert(0, carry);
        }
        return result.toString();
    }
}
