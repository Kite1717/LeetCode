class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
Memory Usage: 33.6 MB, less than 6.67% of Java online submissions for Add Digits.
*/
    public int addDigits(int num) {
        
      return (num!= 0 && num %9 == 0) ? 9 : num %9; 
    }
}