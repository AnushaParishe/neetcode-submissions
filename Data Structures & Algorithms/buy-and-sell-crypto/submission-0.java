class Solution {
    public int maxProfit(int[] prices) {
      int sellprice=0;
      for(int i=0;i<prices.length;i++){
         int costprice=prices[i];
         for(int j=i+1;j<prices.length;j++){
               sellprice=Math.max(sellprice,prices[j]-prices[i]);
         }
      }  
      return sellprice;
    }
}
