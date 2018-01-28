/*
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
*/

class Solution {
    public String convertToTitle(int n) {
        if (n <= 0) return "";
        StringBuffer result = new StringBuffer();
        while (n > 0) {
            n--;
            result.insert(0, (char)('A'+n%26));
            n /= 26;
        }
        return result.toString();
    }
}
