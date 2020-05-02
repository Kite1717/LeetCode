class Solution {
    /*
    Runtime: 1 ms, faster than 88.43% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 37 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
*/
    public int maxProfit(int[] prices) {
      if(prices.length == 0) return  0;
         
        int buy = prices[0];
        int profit = 0;
       for (int i = 1; i< prices.length ;i++)
       {
          if(prices[i] - buy > profit) profit = prices[i] - buy;
          else if( prices [i] - buy < 0)
          {
              if(prices[i] > buy) break;
              buy = prices[i];
              
          }
          
       }
       return  profit;
    }
}