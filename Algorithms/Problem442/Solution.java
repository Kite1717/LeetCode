class Solution {
    
    /*
    Runtime: 4 ms, faster than 100.00% of Java online submissions for Find All Duplicates in an Array.
Memory Usage: 47.6 MB, less than 91.67% of Java online submissions for Find All Duplicates in an Array.
    */
    public List<Integer> findDuplicates(int[] nums) { 
         int[] counted = new int[nums.length+1];
         List<Integer> data = new ArrayList<>();

         for(int i = 0; i< nums.length ;i ++)counted[nums[i]]++;

         for(int i = 1; i< counted.length;i++)
         {
             if(counted[i] == 2) data.add(i);
         }
       return  data;
    }
}