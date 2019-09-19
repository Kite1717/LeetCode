class Solution {
    /*
    Runtime: 4 ms, faster than 82.52% of Java online submissions for Reverse Words in a String III.
Memory Usage: 38.5 MB, less than 91.23% of Java online submissions for Reverse Words in a String III.
*/
   public String reverseWords(String s) {

        String[] splts = s.split(" ");

        StringBuilder sb = new StringBuilder();
        sb.append(new StringBuilder(splts[0]).reverse());
        
        for(int i = 1 ; i< splts.length ;i ++)
            sb.append(" " + new StringBuilder(splts[i]).reverse());
        
        return sb.toString();

    }
}