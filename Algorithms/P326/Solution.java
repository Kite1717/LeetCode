class Solution {
    /*
    Runtime: 10 ms, faster than 100.00% of Java online submissions for Power of Three.
Memory Usage: 35.5 MB, less than 6.25% of Java online submissions for Power of Three.
*/
    public boolean isPowerOfThree(int n) {
        
        //The biggest power of 3 that fits into 32 bits is 3486784401 (3^20)
       return n>0 && 3486784401l % n == 0;
    }
}