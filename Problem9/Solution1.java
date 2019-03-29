package com.LeetCode;


public class Solution1 {

    public static boolean isPalindrome(int x) {

        /*
        Runtime: 8 ms, faster than 98.25% of Java online submissions for Palindrome Number.
          Memory Usage: 35.4 MB, less than 100.00% of Java online submissions for Palindrome Number.
         */

        if( x < 0) return  false;
        boolean ret = true;
        //I got close to the end from the beginning by turning it into a character array
         char[]arr = String.valueOf(x).toCharArray();
         for (int i= 0,top=arr.length-1; i<arr.length;i++,top--)
         {
             if(arr[i] != arr[top])
             {
                 ret = false;
                 break;
             }

         }
    return  ret;

    }


}
