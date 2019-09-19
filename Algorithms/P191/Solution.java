public class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
Memory Usage: 33.4 MB, less than 5.41% of Java online submissions for Number of 1 Bits
*/
    public int hammingWeight(int n) {
     int countOfOneBit = 0;
        
    while (n != 0) {
        countOfOneBit++;
        n &= (n - 1);
    }
    return countOfOneBit;
    }
}