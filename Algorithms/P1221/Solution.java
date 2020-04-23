class Solution {
/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Split a String in Balanced Strings.
Memory Usage: 35.5 MB, less than 100.00% of Java online submissions for Split a String in Balanced Strings.
*/
    public int balancedStringSplit(String s) {

       char [] arr = s.toCharArray();
        int i=0,count = 0 , balanced = 0;
        while (arr.length > i)
        {
            balanced += (arr[i] == 'R') ? 1 :-1;
            if(balanced == 0) count++;
            i++;
        }
        return count;
    }
}