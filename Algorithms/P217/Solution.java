class Solution {
    
    /*
    Runtime: 1 ms, faster than 99.97% of Java online submissions for Contains Duplicate.
Memory Usage: 40.1 MB, less than 100.00% of Java online submissions for Contains Duplicate.
*/
    
    public boolean containsDuplicate(int[] nums) {
        
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxVal){
                maxVal = nums[i];
            }
            if(nums[i] < minVal){
                minVal = nums[i];
            }
        }
        
        boolean check[] = new boolean[maxVal - minVal + 1];
        for(int num : nums){
            if(check[num-minVal]){
                return true;
            }
            check[num-minVal] = true;
        }
        
        return false;
    }
}