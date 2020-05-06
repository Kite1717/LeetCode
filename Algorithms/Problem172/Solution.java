class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Factorial Trailing Zeroes.
Memory Usage: 33.2 MB, less than 7.69% of Java online submissions for Factorial Trailing Zeroes.
*/
    public int trailingZeroes(int n) {
      int fiveCount = 0; 
        
        while(n > 4){
            
            fiveCount += n/5;
            n /= 5;
        }
        return  fiveCount;
    }
}