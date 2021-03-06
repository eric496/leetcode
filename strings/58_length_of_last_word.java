/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:
    Input: "Hello World"
    Output: 5
*/

// method 1: use string instance methods
class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) return 0;
        String[] words = s.split("\\s+");
        return words[words.length-1].length();
    }
}

// method 2
class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) return 0;
        int count = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (s.charAt(i) == ' ' && count != 0) {
                break;
            }
        }
        return count;
    }
}
