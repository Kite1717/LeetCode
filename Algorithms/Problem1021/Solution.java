class Solution {
 public String removeOuterParentheses(String S) {
     /*
     Runtime: 2 ms, faster than 97.83% of Java online submissions for Remove Outermost Parentheses.
Memory Usage: 35.9 MB, less than 99.86% of Java online submissions for Remove Outermost Parentheses. */

        StringBuilder sb = new StringBuilder();
         char [] str = S.toCharArray();
        int left =0, right = 0;
        int startSub = 0;
        for(int i = 0; i < str.length ;i ++)
        {
            if(str[i] == ')')right++;
            else left++;
            if(right == left && left != 0 )
            {

                sb.append(S.substring(startSub+1,i));
                startSub = i+1;
                left = 0; right = 0;
            }
        }
      return sb.toString();
    }

}