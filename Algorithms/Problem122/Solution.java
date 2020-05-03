class Solution {
    /*
    Runtime: 1 ms, faster than 94.87% of Java online submissions for Best Time to Buy and Sell Stock II.
Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock II.
*/
    public int maxProfit(int[] prices) {
       
        int sumProfit = 0; 
        for(int i = 1; i< prices.length ;i ++)
            if(prices[i] - prices[i-1] > 0) 
                sumProfit += prices[i] - prices[i-1];
            
            return  sumProfit;
    }
}