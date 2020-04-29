package com.LeetCode;

import java.util.ArrayList;

public class Solution {



    public  int romanToInt(String s)
    {
        if(s.equals("")) return 0;
        if(s.equals(null)) throw  new NullPointerException();
        ArrayList<Integer> nums = new ArrayList<>();
        for(char i : s.toCharArray())
        {
            switch (i)
            {
                case 'M':
                {
                   nums.add(1000);
                   break;
                }
                case 'D':
                {
                    nums.add(500);
                    break;
                }
                case 'C':
                {
                    nums.add(100);
                    break;
                }
                case 'L':
                {
                    nums.add(50);
                    break;
                }
                case 'X':
                {
                    nums.add(10);
                    break;
                }
                case 'V':
                {
                    nums.add(5);
                    break;
                }
                case 'I':
                {
                    nums.add(1);
                    break;
                }

            }

        }

        int sum = 0;
        for (int i = 0; i< nums.size();i++)
        {
            sum += (i+1 < nums.size() && nums.get(i) < nums.get(i+1)) ? -nums.get(i) : nums.get(i);

        }

        return sum;

    }
}
