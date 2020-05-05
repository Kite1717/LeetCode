class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Majority Element.
Memory Usage: 42.4 MB, less than 60.29% of Java online submissions for Majority Element.
*/
   
    public int majorityElement(int [] nums)
    {
        if(nums == null || nums.length == 0)return  0;
        else  return majorityElement(nums,0,nums[0]);
    }
    private int majorityElement(int[] nums,int start,int current) {

         int count = 1;
        for(int i = start ; i < nums.length ;i++ )
        {
            if(current == nums[i]) count++;
            else  count--;

            if(count == 0) return majorityElement(nums,i+1,nums[i]);
        }
         return  current;

    }
}