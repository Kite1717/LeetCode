class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
Memory Usage: 38.6 MB, less than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
*/
    public int repeatedNTimes(int[] A) {
     
        for(int i = 1; i <  3 ; i++)
            for(int j = 0; j < A.length - i ; j++)
                if(A[j] == A[i + j ]) return A[j];

        return A[0];
    }
}