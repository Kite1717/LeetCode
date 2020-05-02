public class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
Memory Usage: 32.9 MB, less than 5.26% of Java online submissions for Climbing Stairs.
*/
    public int climbStairs(int n) {
       //Dynamic Programming
       
        int step1 = 1;
        int step2 = 2;
        
        if(n == 1) return step1;
        if(n == 2) return step2;
        
        int nextStep = 0;
        for (int i = 3; i <= n; i++)
        {
           nextStep = step1 + step2;
           step1 = step2;
           step2 = nextStep;
           
        }
        return  nextStep;
    }
}