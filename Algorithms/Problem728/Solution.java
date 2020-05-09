class Solution {
   
    /*Runtime: 1 ms, faster than 100.00% of Java online submissions for Self Dividing Numbers.
Memory Usage: 33.9 MB, less than 35.91% of Java online submissions for Self Dividing Numbers. */
    public  List<Integer> selfDividingNumbers(int left , int right)
    {
        List<Integer> data =  new ArrayList<>();
        if(!(left >=1 &&  right <= 10000 && left < right)) return  data;

        for (int i = left ; i <= right ;i++)
        {
           if(helper(i)) data.add(i);
        }
        return  data;
    }

    public boolean helper(int number)
    {
        int temp = number;
        while (temp !=0)
        {
            if(  temp % 10 == 0 || number % (temp % 10) != 0) return  false;
            temp /=10;
        }
       return true;
    }
}