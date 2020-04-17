package com.Demo;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
        Memory Usage: 39.1 MB, less than 9.23% of Java online submissions for Longest Common Prefix.
         */

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;

    }
}
