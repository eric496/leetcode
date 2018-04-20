/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
    Given s = "hello", return "holle".

Example 2:
    Given s = "leetcode", return "leotcede".

Note:
    The vowels does not include the letter "y".
*/

class Solution {
    public static final String VOWELS = "aeiouAEIOU";
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return "";
        char[] sCharArray = s.toCharArray();
        int start = 0, end = s.length()-1;
        while (start < end) {
            while (start < end && !VOWELS.contains(sCharArray[start]+"")) start++;
            while (start < end && !VOWELS.contains(sCharArray[end]+"")) end--;
            char temp = sCharArray[start];
            sCharArray[start] = sCharArray[end];
            sCharArray[end] = temp;
            start++;
            end--;
        }
        return new String(sCharArray);
    }
}