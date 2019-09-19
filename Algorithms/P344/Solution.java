class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
Memory Usage: 47.6 MB, less than 91.12% of Java online submissions for Reverse String.
*/
    public void reverseString(char[] s) {
       int left = 0 ,right = s.length -1 ;
            while (left < right)
            {
                s[left] ^= s[right];
                s[right] ^= s[left];
                s[left] ^= s[right];
                left ++ ; right--;
            } 
    }
}