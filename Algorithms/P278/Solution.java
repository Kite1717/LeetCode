public class Solution extends VersionControl {
    /*
    Runtime: 10 ms, faster than 99.57% of Java online submissions for First Bad Version.
Memory Usage: 32.9 MB, less than 100.00% of Java online submissions for First Bad Version.
*/
    public int firstBadVersion(int n) {

      //use binary search
        int bot = 1;
        int top = n;
        
        while ( bot <= top)
        {
           int mid = (top - bot ) /2 + bot;

           if(isBadVersion(mid))  top = mid -1;
           else  bot = mid +1  ;
        }
      return  bot ;
        
    }
}