class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
Memory Usage: 33.2 MB, less than 6.12% of Java online submissions for Valid Perfect Square.
*/
    public boolean isPerfectSquare(int num) {
         long lnum = num;
         long bot = 1 , top = num;

        while (bot <= top)
        {
            long mid = (top - bot) / 2 + bot;
            if(mid * mid == lnum) return  true;
            else if(mid * mid > lnum) top  = mid - 1;
            else bot  = mid + 1;
        }

        return  false;
    }
}