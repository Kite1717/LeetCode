class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 36 MB, less than 100.00% of Java online submissions for Excel Sheet Column Number.
*/
    public int titleToNumber(String s) {
        
        char [] charSet = s.toCharArray();
        int sum = 0;
        
        for(int i = charSet.length -1 ,multi = 1; i >= 0; i--)
        {
            sum += ((int)charSet[i] - 64 ) * multi;
            multi *=26;
        }
        return  sum;
    }
}

