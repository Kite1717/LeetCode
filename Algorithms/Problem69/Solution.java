class Solution {
    
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Sqrt(x).
Memory Usage: 33.5 MB, less than 5.00% of Java online submissions for Sqrt(x).
*/
    public int mySqrt(int x) {
        
          //use BinarySearch
        int left = 1 ,right = x;
        while (left <= right)
        {
            int mid = (right - left) / 2 + left;
            if(mid > x / mid) right = mid -1;
            else  left = mid +1;

        }
        return right;
        //Quick way
        //return (int)Math.sqrt(x);


    }
}