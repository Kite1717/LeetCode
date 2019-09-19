class Solution {
    /*
       Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
   Memory Usage: 38 MB, less than 87.41% of Java online submissions for Move Zeroes.
   */
    public void moveZeroes(int[] nums) {
        //corner case
        if (nums == null || nums.length == 0) return;

        //use insert index
        int insertPos = 0;
        for (int num: nums)
            if (num != 0)
            nums[insertPos++] = num;

        while (insertPos < nums.length)
            nums[insertPos++] = 0;
    }