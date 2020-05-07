import java.util.ArrayList;
import java.util.List;
class Solution {
    
    /*
    Runtime: 4 ms, faster than 99.96% of Java online submissions for Find All Numbers Disappeared in an Array.
Memory Usage: 47.8 MB, less than 81.13% of Java online submissions for Find All Numbers Disappeared in an Array.
     */
    //Use counting sort
    public List<Integer> findDisappearedNumbers(int[] nums)
    {

         int[] counted = new int[nums.length+1];
         List<Integer> data = new ArrayList<>();

         for(int i = 0; i< nums.length ;i ++)counted[nums[i]]++;
         
         for(int i = 1; i< counted.length;i++)
         {
             if(counted[i] == 0) data.add(i);
         }
       return  data;
    }
}