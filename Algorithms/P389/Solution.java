class Solution {
    /*
    Runtime: 1 ms, faster than 98.83% of Java online submissions for Find the Difference.
Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Find the Difference.
*/
    public char findTheDifference(String s, String t) {
        int sum1 = 0  , sum2 = 0;
        
        char [] chars = s.toCharArray();
        for(int i = 0  ; i < chars.length ; i++)sum1 += chars[i];
        
        chars = t.toCharArray();
        for(int i = 0  ; i < chars.length ; i++)sum2 += chars[i];
        
        return (char) Math.abs(sum1 - sum2);
    }
}