package com.LeetCode;


import java.util.LinkedList;
import java.util.List;

public class Solution {


    public static String convert(String s, int numRows)
    {
        if(numRows == 1) return  s;
        List<StringBuilder> rows = new LinkedList<StringBuilder>();
   //  The reason we use StringBuilder object when you append references, so we won't
        for(int i= 0; i < Math.min(numRows,s.length()) ;i ++)
            rows.add(new StringBuilder());

        int currentRow=0;
        boolean goingDown= false;

         //Zig Zag algorithm :
        //Add all of the letters on each line when
        // it comes to the last line or the first line
        // on the cross sections for the letters of
        //next go back or forward until the last letter
        for(char c : s.toCharArray())
        {

            rows.get(currentRow).append(c);
            if(currentRow == 0 || currentRow == numRows -1)
                goingDown = !goingDown;
             currentRow += goingDown ? 1:-1;

        }

        // return value
        StringBuilder ret = new StringBuilder();
        //  I'm adding all the rows
        for (StringBuilder row : rows)
            ret.append(row);

        return ret.toString();

    }




}
