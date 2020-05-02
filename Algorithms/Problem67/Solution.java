class Solution {
    
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Binary.
Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Add Binary.
*/
    public String addBinary(String a, String b) {
       
       
        int diff = a.length() - b.length();

        StringBuilder sb0 = new StringBuilder();

        if(diff > 0)
        {
            for(int i = 0;  i < diff ; i++) sb0.append("0");
            b = sb0.toString() + b;
        }
        else
        {
            diff *=-1;
            for(int i = 0;  i < diff ; i++) sb0.append("0");
            a = sb0.toString() + a;
        }


        sb0 = new StringBuilder();

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        boolean carry = false;

        for(int i = charA.length -1; i >= 0; i--)
        {
          if(charA[i] == '1' && charB[i] == '1')
          {
             if(carry) sb0.append("1");
             else sb0.append("0");
             carry = true;
          }
          else if(charA[i] == '1' || charB[i] == '1')
          {
              if(carry)sb0.append("0");
              
              else sb0.append("1");
          }
          else if(charA[i] == '0' && charB[i] == '0')
          {
              if(carry)
              {
                  sb0.append("1");
                  carry = false;
              }
              else sb0.append("0");
          }
        }

        if(carry)sb0.append("1");

       return  sb0.reverse().toString();
    }

    }
