package com.LeetCode;

import java.util.Arrays;

public class Solution16 {

    public static int threeSumClosest(int[] arr, int target) {

        Arrays.sort(arr);

        int ret = arr[0] + arr[1] + arr[2];
        int range = Math.abs(ret -target);

       for (int i= 0,top = arr.length-1,base = i+1; i < arr.length-2 ;i ++)
       {
           while (top > base) {
               if( Math.abs(arr[i] + arr[base] + arr[top] - target) < range)
               {
                   ret = arr[i] + arr[base] + arr[top];
                   range = Math.abs(ret - target);
               }

               if ( arr[i] + arr[base] + arr[top] - target < 0) base++;
               else if (arr[i] + arr[base] + arr[top] - target == 0) return target;
               else top --;
           }

           top = arr.length -1 ;
           base = i+2;

       }

       return  ret;

    }
}

