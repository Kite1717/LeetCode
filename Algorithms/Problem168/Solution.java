class Solution {
    
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
Memory Usage: 34 MB, less than 100.00% of Java online submissions for Excel Sheet Column Title.
*/
 private static final char[] letters = new char[26];
    static {
        for(int i = 0; i < 26 ;i++)
        {
            letters[i]= (char)('A' + i);
        }

    }
    public String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();
       n--;
       while (n >= 0)
       {
            sb.append(letters[n % 26]);
           n = (n / 26) -1;
       }
       return sb.reverse().toString();
}
}