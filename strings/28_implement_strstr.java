/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
    Input: haystack = "hello", needle = "ll"
    Output: 2

Example 2:
    Input: haystack = "aaaaa", needle = "bba"
    Output: -1
*/

class Solution {
    public int strStr(String haystack, String needle) {
	// corner cases
        if (haystack.length() < needle.length()) return -1;
        if (haystack == null || needle == null) return -1;
        if (haystack.length() == 0 || needle.length() == 0) return 0;
        int diff = haystack.length() - needle.length();
        for (int i = 0; i <= diff; i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
