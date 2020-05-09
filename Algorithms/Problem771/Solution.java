package com.LeetCode;

public class Solution {

/*Runtime: 1 ms, faster than 95.30% of Java online submissions for Jewels and Stones.
Memory Usage: 34.8 MB, less than 99.61% of Java online submissions for Jewels and Stones.*/

    public int numJewelsInStones(String jewel, String stone) {

        
        if(jewel.length() > 50 || stone.length() > 50 || jewel.equals("") || stone.equals("") ) return 0;
        int matched = 0;
        for(int i = 0; i< jewel.length();i++)
        {
            for(int j = 0; j< stone.length();j++)
            {
                if(jewel.charAt(i) == stone.charAt(j)) matched++;
            }
        }

         return  matched;
    }
}
