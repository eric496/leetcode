/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0 || s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            if (!stack.isEmpty()) {
                if (c == ')') {
                    if (stack.pop() != c) return false; 
                } else if (c == '}') {
                    if (stack.pop() != c) return false;
                } else if (c == ']') {
                    if (stack.pop() != c) return false;
                }    
            }
        }
        return stack.isEmpty();
    }
}
