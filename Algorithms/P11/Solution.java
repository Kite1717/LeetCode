package com.Demo;

public class Solutions {

    public int maxArea(int[] height) {

        /*
        Runtime: 2 ms, faster than 98.43% of Java online submissions for Container With Most Water.
        Memory Usage: 41 MB, less than 5.05% of Java online submissions for Container With Most Water.
         */
        int max = 0, left = 0, right = height.length - 1;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;


    }

}
