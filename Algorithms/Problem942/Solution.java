class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for DI String Match.
Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for DI String Match.
*/
    public int[] diStringMatch(String S) {
        
        
        char [] charSet = S.toCharArray();
        int [] numSet = new int[charSet.length +1];

        int top = charSet.length;
        int base = 0;

        if(charSet[0] == 'I'){
            numSet[0] = base;
            base++;
        }
        else{
            numSet[0] = top;
            top--;
        }
          int i = 0;
        for(i= 1; i < charSet.length ;i ++)
        {
          if(charSet[i] == 'I'){
              numSet[i] = base;
              base++;
          }
          else {
              numSet[i] = top;
              top--;
          }
        }

        if(charSet[0] == 'I'){
            numSet[i] = base;
            base++;
        }
        else{
            numSet[i] = top;
            top--;
        }

        return numSet;
    }
}