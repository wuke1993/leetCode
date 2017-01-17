package easy;

// 2016.4.19
// Time Limit Exceeded

public class BestTimeToBuySellStock121 {
	public static int maxProfit(int[] prices) {
		int maxProfit  = 0;
		int profit = 0;
		
        if(prices.length == 0)
            return 0;
        else {
        	// calculate all the results    cost O(n*n)
        	for(int i = 0; i < prices.length; i++) {
        		for(int j = (i + 1); j < prices.length; j++) {
        			profit = prices[j] - prices[i];
        			if(profit > maxProfit)
        				maxProfit = profit;
        		}
        	}
        	return maxProfit;
        }	
    }
	// test
	public static void main(String[] args) {
		int[] price = {0};
		int[] price1 = {0,4,2,7,1,9,11,2};
		int[] price2 = {9,4,2,7,1,9,11,2};
		int[] price3 = {9,8,7,7,6,1,0};
		System.out.println(maxProfit(price));
		System.out.println(maxProfit(price1));
		System.out.println(maxProfit(price2));
		System.out.println(maxProfit(price3));
	}
}
