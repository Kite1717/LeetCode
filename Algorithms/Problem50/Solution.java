class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Pow(x, n).
Memory Usage: 33.8 MB, less than 5.88% of Java online submissions for Pow(x, n).
*/
    public double myPow(double x, int n) {
 			if(n == 0)
 				return 1;
 			double y = myPow(x, n/2);
 			if(n%2 == 0)
 				return y * y;
 			else if(n > 0 && n % 2 == 1)
 				return x * y * y;
 			else
 				return 1/x * y * y;


    }
}