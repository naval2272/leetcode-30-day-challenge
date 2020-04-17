public class day5 {
  public int maxProfit(int[] prices) {
    int totalPrice = 0;
    for(int i = 0; i < prices.length - 1; i++) {
      if(prices[i+1] > prices[i]) {
        totalPrice = totalPrice + prices[i+1] - prices[i];
      }
    }
    return totalPrice;
  }
}
