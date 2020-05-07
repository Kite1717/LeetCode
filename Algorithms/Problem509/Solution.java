class Solution {
    
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
Memory Usage: 32.8 MB, less than 95.14% of Java online submissions for Fibonacci Number. */
   
  public  int fib(int n)
    {
        if(n == 0) return  0;
        if( n == 1 || n == 2) return 1;
        int f1=1,f2=1;
        for(int i = 0; i < n-2; i++)
        {
            int temp = f1;
            f1 = f1 + f2;
            f2 = temp;
        }
        return f1;
    }

}