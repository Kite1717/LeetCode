
class Solution {

    //step by step solution

    /*Runtime: 1 ms, faster than 94.12% of Java online submissions for Base 7.
    Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Base 7.*/
    public String convertToBase7(int num) {

        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        if( num == 0) return "0";
         if( num < 0)
         {
             flag = true;
             num*=-1;
         }
        while (num != 0)
        {
            sb.append((num%7));
            num /=7;

        }
         return (flag) ? sb.append("-").reverse().toString() : sb.reverse().toString();


    }

    //practice solution
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Base 7.
Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Base 7.
     */
     public String practiceConvertToBase7(int num) {


        return Integer.toString(num, 7);
    }


    //recursive solution
    /*
    Runtime: 1 ms, faster than 94.12% of Java online submissions for Base 7.
Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Base 7
     */
    public  String recursiveConvertToBase7(int num)
    {
        if (num < 0) return '-' + convertToBase7(-num);
        if (num < 7) return num + "";
        return convertToBase7(num / 7) + num % 7;
    }

}