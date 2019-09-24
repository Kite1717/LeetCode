class Solution {
    /*
    Runtime: 1 ms, faster than 99.66% of Java online submissions for Word Pattern.
Memory Usage: 34 MB, less than 97.30% of Java online submissions for Word Pattern.
*/
    public boolean wordPattern(String pattern, String str) {

         String [] pieces  = str.split(" ");
         int len = pattern.length();
         if(pieces.length != len) return  false;

         char[] pat = pattern.toCharArray();

          int [] source = new int[500];
          int [] target = new int[500];


           Arrays.fill(source,-1);
           Arrays.fill(target,-1);

         for(int i = 0; i < len ;i ++)
         {
              int c1 = pat[i] - ' ';
              int c2 = Math.abs(pieces[i].hashCode() % 135);

              if(source[c1] < 0)
              {
                  if(target[c2] < 0)
                  {
                    source[c1] = c2;
                    target[c2] = c1;
                  }
                  else  return  false;
              }
              else  if(source[c1] != c2)
                  return  false;
         }
         return true;
    }

}