class Solution {
    public int maxProfit(int[] prices) {
      int mincost=prices[0];
      int maxsell=0; 
      for(int i=1;i<prices.length;i++){
              mincost=Math.min(mincost,prices[i]);
              maxsell=Math.max(maxsell,prices[i]-mincost);
      }
      return maxsell;
    }
}
