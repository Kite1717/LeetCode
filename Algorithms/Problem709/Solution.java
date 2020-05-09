public class Solution {
  /*  Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
Memory Usage: 34.3 MB, less than 99.75% of Java online submissions for To Lower Case. */
    

    public String toLowerCase(String str) {
         String s = "";
        if(str == null) return  null;
        for (int i= 0; i < str.length();i++)
        {
            if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90)
            {
                 s += (char) (str.charAt(i) +32);
                System.out.println(str.toCharArray()[i]);
            }
            else s += str.charAt(i);
        }
        return s;
    }
}