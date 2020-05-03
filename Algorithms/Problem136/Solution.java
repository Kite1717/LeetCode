class Solution {
    /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
    Memory Usage: 38.7 MB, less than 98.52% of Java online submissions for Single Number. */

    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
                result ^= i;
        }
        return result;
    }
}