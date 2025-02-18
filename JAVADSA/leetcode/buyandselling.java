package leetcode;

public class buyandselling {
    public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};

    int maxPro = maxProfit(arr);
    System.out.println("Max profit is: " + maxPro);

    }
//     static int maxProfit(int[] arr) {
//     int maxPro = 0;
//     int minPrice = Integer.MAX_VALUE;
//     for (int i = 0; i < arr.length; i++) {
//         minPrice = Math.min(minPrice, arr[i]);
//         maxPro = Math.max(maxPro, arr[i] - minPrice);
//     }
//     return maxPro;
//     }
public static int maxProfit(int[] prices) {
      int buyPrice = prices[0];
      int profit = 0;

      for (int i = 1; i < prices.length; i++) {
          if (buyPrice > prices[i]) {
              buyPrice = prices[i];
          }

          profit = Math.max(profit, prices[i] - buyPrice);
      }

      return profit;        
  }
}