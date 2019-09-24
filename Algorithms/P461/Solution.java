class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
Memory Usage: 33.1 MB, less than 5.09% of Java online submissions for Hamming Distance.
*/
    public int hammingDistance(int x, int y) {
        int diff = 0;
       int xor = x ^ y ;

       while (xor != 0)
       {
           if((xor & 1) == 1) diff++;
            xor>>>=1;
       }
       return  diff; 
    }
}