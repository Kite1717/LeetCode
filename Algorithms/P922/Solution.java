class Solution {
    /*
    Runtime: 2 ms, faster than 99.65% of Java online submissions for Sort Array By Parity II.
Memory Usage: 40.3 MB, less than 100.00% of Java online submissions for Sort Array By Parity II.
*/
    public int[] sortArrayByParityII(int[] A) {
       int[] parity = new int[A.length];
       int even = 0 , odd = 1;
       for(int i = 0; i < A.length ;i++)
       {
           if(A[i] % 2 == 0)
           {
               parity[even] = A[i];
               even += 2;
           }
           else
           {
               parity[odd] = A[i];
               odd +=2;
           }
       }
        return  parity;
    }
}