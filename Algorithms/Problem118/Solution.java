

import java.util.ArrayList;
import java.util.List;

public  class  Solution{

    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> data = new ArrayList<>();
        if(numRows == 0) return  data;
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(1);
        data.add(temp1);
        if( numRows == 1) return  data;

        temp1 = new ArrayList<>();
        temp1.add(1);temp1.add(1);
        data.add(temp1);
        if(numRows == 2) return  data;
        for(int i = 0; i< numRows -2;i ++)
        {
            List<Integer> temp2 = new ArrayList<>();
            temp2.add(1);
            for(int j = 0; j < temp1.size() - 1;j++)
            {
                temp2.add(temp1.get(j) + temp1.get(j+1));

            }
           temp2.add(1);
           data.add(temp2);

           temp1 = new ArrayList<>(temp2);
        }
         return  data;
    }
}