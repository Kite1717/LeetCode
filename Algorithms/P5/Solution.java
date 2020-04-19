class Solution {

/*
Runtime: 4 ms, faster than 98.95% of Java online submissions for Longest Palindromic Substring.
Memory Usage: 39.7 MB, less than 20.16% of Java online submissions for Longest Palindromic Substring.
*/

    int startIndex=0;
    int endIndex=0;
    public String longestPalindrome(String s) {
        if(s == null ||s.length() ==0)
            return "";
        int n = s.length();

        char[] ss = s.toCharArray();
        int i=0;
        while(i<n){
            System.out.println(s.substring(startIndex, endIndex+1));
            i= expansion(ss,i);
        }

        return s.substring(startIndex, endIndex+1);
    }

    public int expansion(char[] ss, int start ){
        int nextSt = start+1;
        int size =ss.length;

        while(start>=0 && nextSt < size && ss[start] == ss[nextSt])
            nextSt++;
        int end =nextSt -1;


        while(start-1 >=0 && end+1 <size && ss[start-1] == ss[end+1] ){
            start--;end++;
        }

        if((endIndex-startIndex) < (end-start)){
            endIndex = end;
            startIndex =start;
        }

        return nextSt;
    }

   
}