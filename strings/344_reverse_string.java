/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

// method 1
class Solution {
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}

// method 2
class Solution {
    public String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char temp = charArray[low];
            charArray[low] = charArray[high];
            charArray[high] = temp;
            low++;
            high--;
        }
        return new String(charArray);
    }
}
