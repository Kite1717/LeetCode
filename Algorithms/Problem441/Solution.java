class Solution {

    /*Runtime: 1 ms, faster than 100.00% of Java online submissions for Arranging Coins.
Memory Usage: 33.7 MB, less than 5.26% of Java online submissions for Arranging Coins. */

    public int arrangeCoins(int n) {

        if(n == 0) return 0;

        long left = 1, right = n;
        //use binary search algorithm for row count of coins
        // if n is equals 50 (t * t+1)/ 2 ~= 50
        while(left <= right) {
            long mid = left + (right - left) / 2;
            long val = (mid * (mid + 1)) / 2;
            //System.out.println("l=" + left + " m=" + mid + " r=" + right + "  Val : " + val);
            if(val == n) return (int)mid;
            if(val < n) {
                left = mid + 1;


            } else
                right = mid - 1;


        }
        return (int)left -1;
    }


}