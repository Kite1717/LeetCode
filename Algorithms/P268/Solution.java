class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
Memory Usage: 39.4 MB, less than 100.00% of Java online submissions for Missing Number
*/
    public int missingNumber(int[] nums) {
     int res = nums.length;
       for(int i = 0; i < nums.length ;i++)
       {
           res ^= i ^ nums[i];
       }
       return res;
    }
}