class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Search Insert Position.
*/
     public int searchInsert(int[] nums, int target) {


        int bot = 0;
        int top = nums.length -1;

        while (bot <= top)
        {
            int mid = (top - bot ) / 2 + bot;
            if(nums[mid] ==  target) return mid;
            else if( nums[mid] > target) top = mid - 1;
            else bot = mid +1;

        }

        return  bot;
    }
}