class Solution {
     /*
     Runtime: 3 ms, faster than 100.00% of Java online submissions for Binary Prefix Divisible By 5.
Memory Usage: 39.7 MB, less than 100.00% of Java online submissions for Binary Prefix Divisible By 5.
*/
    public List<Boolean> prefixesDivBy5(int[] A) {

       List<Boolean> data = new ArrayList<>();
        
        for(int i = 0,lastDigit = 0; i < A.length ;i ++)
        {
          lastDigit = (2 * lastDigit  + A[i]) % 10;
          data.add(lastDigit == 0 || lastDigit == 5);
            

        }
        return  data;


    }

}