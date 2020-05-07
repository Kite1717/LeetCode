class Solution {
    
    /*
    Runtime: 2 ms, faster than 99.68% of Java online submissions for Max Consecutive Ones.
Memory Usage: 37.9 MB, less than 100.00% of Java online submissions for Max Consecutive Ones.
    */
    public int findMaxConsecutiveOnes(int[] nums) {
     int counter = 0, max = 0;
       for(int i = 0 ; i < nums.length ; i++)
       {

           if(nums[i] == 1) {
               counter++;
               if( max < counter) max = counter;
           }
           else  counter=0;
          
       }
       return  max;
    }
}