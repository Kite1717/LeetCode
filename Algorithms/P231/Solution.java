class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Two.
Memory Usage: 33.5 MB, less than 7.32% of Java online submissions for Power of Two.
*/
    public boolean isPowerOfTwo(int n) {
     
      if(n <= 0) return  false;
       if(n == 1) return  true;
       while (n != 1)
       {
           if(n % 2 == 1) return false;
           n/=2;
       }
       return  true;
    }
}