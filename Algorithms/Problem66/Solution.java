class Solution {
    
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
Memory Usage: 35.1 MB, less than 98.58% of Java online submissions for Plus One.
*/
    public int[] plusOne(int[] digits) {
      
        boolean carry = false;
        for(int i = digits.length -1; i >= 0; i--)
        {
           if(i == digits.length-1) digits[i]++;

           if(carry){
               digits[i]++;
               carry = false;
           }
            if(digits[i] == 10)
            {
                digits[i] =0;
                carry = true;
            }
            else break;

        }
        if(carry)
        {
             int [] carried = new int[digits.length+1];
             carried[0] = 1;
             for (int i = 0; i < digits.length ;i++)
                 carried[i+1] = 0;
               return  carried;
        }
        return digits;
    }
}