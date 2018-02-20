/*
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:

    pattern = "abba", str = "dog cat cat dog" should return true.
    pattern = "abba", str = "dog cat cat fish" should return false.
    pattern = "aaaa", str = "dog cat cat dog" should return false.
    pattern = "abba", str = "dog dog dog dog" should return false.

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space. 
*/

// two hash maps
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split("\\s");
        char[] chars = pattern.toCharArray();
        if (chars.length != strs.length) return false;
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map1.containsKey(chars[i])) {
                if (!map1.get(chars[i]).equals(strs[i])) return false;
            } else {
                map1.put(chars[i], strs[i]);
            }
            if (map2.containsKey(strs[i])) {
                if (map2.get(strs[i]) != chars[i]) return false;
            } else {
                map2.put(strs[i], chars[i]);
            }
        }
        return true;
    }
}

// one hash map
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split("\\s");
        char[] chars = pattern.toCharArray();
        if (chars.length != strs.length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                if (!map.get(chars[i]).equals(strs[i])) return false;
            } else {
                if (map.containsValue(strs[i])) return false;
                map.put(chars[i], strs[i]);
            }
        }
        return true;
    }
}
