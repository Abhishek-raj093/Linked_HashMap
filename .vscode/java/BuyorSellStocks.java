//Buy and Cell Stocks

import java.util.*;

public class BuyorSellStocks {

    public static int buyandSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {  //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);//global profit
            }else{
                buyPrice = prices[i];//if today we are not making profit by selling then we buy the stock insted of selling today
            }
        }

        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};///O(n)
        System.out.println(buyandSellStocks(prices));
    }
}
