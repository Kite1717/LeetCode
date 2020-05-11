class Solution {
  public  int[]  sortArrayByParity(int [] nums)
    {
     /* Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
Memory Usage: 39.7 MB, less than 95.04% of Java online submissions for Sort Array By Parity.
 */
     if(nums.length < 1) return  nums;
        for (int i= 0,even = 0; i < nums.length ;i ++)
        {
            if(nums[i] %2 == 0 && nums[i] !=nums[even])
            {
                nums [i] ^= nums[even];
                nums[even] ^= nums[i];
                nums[i] ^= nums[even];
                even++;

            }
            else if( nums[i] % 2 == 0) even++;
        }
        return nums;
    }
}