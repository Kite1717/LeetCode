class Solution {
    /*
    Runtime: 1 ms, faster than 95.95% of Java online submissions for Last Stone Weight.
Memory Usage: 34 MB, less than 100.00% of Java online submissions for Last Stone Weight.
*/
    
   public int lastStoneWeight(int[] stones) {

     
        int len = stones.length;
        if( len == 1) return stones[0];
        while (true)
        {

            Arrays.sort(stones);
            if(stones[len - 1 ] == 0  && stones[len -  2] == 0)
                return  0;
            else if(stones[len - 2] == 0) return stones[len - 1];

            stones[len - 1] -=stones[len - 2];
            stones[len -2] = 0;
            

        }
    }
}