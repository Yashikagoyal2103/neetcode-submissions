class Solution {
    public int maxProfit(int[] prices) {
      int max=prices[prices.length-1];
      int maxProfit=0;  
      for(int i= prices.length-2 ;i>=0; i--){
        int cost=max - prices[i];
        maxProfit= Math.max(maxProfit, cost);
        max= Math.max(prices[i], max);
      }
      return maxProfit;
    }
}
