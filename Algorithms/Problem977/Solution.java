import java.util.*;

public class Solution {
/*Runtime: 3 ms, faster than 36.81% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 41.2 MB, less than 97.36% of Java online submissions for Squares of a Sorted Array.*/
    public int[] sortedSquares(int[] A) {

        for (int i= 0; i < A.length ;i++)A[i] *=A[i];

        Arrays.sort(A);
        return  A;

    }
}
