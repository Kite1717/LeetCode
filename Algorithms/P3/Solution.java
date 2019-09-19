package com.LeetCode;

import java.util.HashSet;

public class Solution {
    public static  int lengthOfLongestSubstring(String s) {

        HashSet<Character> ch  = new HashSet<>();
        if(s.length() == 1) return 1;
        int ret = 0;
        for (int i = 0,k=0; i < s.length();i++)
        {
            ret =Math.max( ret , ch.size());
            if(ch.contains(s.charAt(i)) && s.charAt(i) != ' ')
            {
                ch.clear();
                k++;
                i=k-1;

            }
            else if(s.charAt(i) == ' ') ch.add(' ');
            else {
                ch.add(s.charAt(i));
                ret =Math.max( ret , ch.size());
            }
        }
        if(ch.size() > ret)  return  ch.size();
        else  return ret;


    }
}
