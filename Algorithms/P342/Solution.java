class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Four.
Memory Usage: 33.2 MB, less than 6.67% of Java online submissions for Power of Four.
*/
    public boolean isPowerOfFour(int num) {
        
        if(num <= 0) return false;
       while(num != 1)
       {
           if(num % 4 !=0) return false;
           num /= 4;
       }
        return true;
    }
}