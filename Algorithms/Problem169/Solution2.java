class Solution {
    /*
    Runtime: 1 ms, faster than 99.97% of Java online submissions for Majority Element.
Memory Usage: 41.7 MB, less than 68.38% of Java online submissions for Majority Element.
*/
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}