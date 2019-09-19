class Solution {
    /*
    Runtime: 2 ms, faster than 98.19% of Java online submissions for Ugly Number II.
Memory Usage: 34.3 MB, less than 54.55% of Java online submissions for Ugly Number II
*/
  public int nthUglyNumber(int n) {

        int index2 = 0 , index3 = 0 , index5 = 0 ,
        factor2 = 2 , factor3 = 3 , factor5 = 5;

        int[] ugly = new int[n];
        ugly[0] = 1;

        for(int i = 1 ; i < n ;i ++)
        {
          int min = Math.min(Math.min(factor2,factor3),factor5);
           ugly[i] = min;

          if(factor2 == min)
          {
           factor2 = 2 * ugly[++index2];
          }
          if(factor3 == min)
          {
            factor3 = 3 * ugly[++index3];
          }
          if(factor5 == min)
          {
             factor5 = 5 * ugly[++index5];
          }
        }
        return ugly[n-1];
    }
}