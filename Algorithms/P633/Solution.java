class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Square Numbers.
Memory Usage: 33.2 MB, less than 7.14% of Java online submissions for Sum of Square Numbers.
*/
    public boolean judgeSquareSum(int c) {
      for(int i=2;i*i<=c;i++){
            int count=0;
            if(c%i==0){
                while(c%i==0){
                    count++;
                    c/=i;
                }
                if(i%4==3 &&count%2!=0)
                    return false;
            }
        }
        return c%4!=3;
    }
}