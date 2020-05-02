class Solution {
    
    /*
   Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
Memory Usage: 35.6 MB, less than 100.00% of Java online submissions for Length of Last Word.
*/
    public  int lengthOfLastWord(String s)
    {
         s = s.trim();
        
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i = chars.length-1; i >= 0 ;i--)
        {
            if(chars[i] == ' ') return  count;
            count++;
        }
        return  count;
    }
    
    
}