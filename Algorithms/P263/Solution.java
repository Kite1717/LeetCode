class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Ugly Number.
Memory Usage: 33.3 MB, less than 6.25% of Java online submissions for Ugly Number.
Next challenges:
*/
    public boolean isUgly(int num) {
         //corner cases
        if(num < 1) return  false;
        if( num == 1) return true;
        while(num > 1)
        {

            if(num % 2  == 0) num /= 2;
            else if(num % 3 == 0) num /= 3;
            else if( num % 5 == 0) num /= 5;
            else  return  false;
        }

        return  true;
    }
}