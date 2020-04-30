public class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
Memory Usage: 37.5 MB, less than 72.52% of Java online submissions for Implement strStr(). */
    public int strStr(String haystack, String needle) {
      int len1 = haystack.length();
        int len2 = needle.length();

        if(len1 < len2) return -1;
        if(len2 == 0) return 0;
        
        int dLen = len1 - len2;

        for(int i = 0; i <=dLen ;i ++)
        {
            if(haystack.substring(i ,i + len2).equals(needle))
                return  i;
        }
        return  -1;
    }
}