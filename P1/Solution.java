package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int carry = target - nums[i];
            if (map.containsKey(carry)) {
                return new int[]{map.get(carry), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
