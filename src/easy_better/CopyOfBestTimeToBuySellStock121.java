package easy_better;

// 2016.4.27
// minPrice is the minimum price from day 0 to day i
// And maxPro is the maximum profit we can get from day 0 to day i
// How to get maxPro? Just get the larger one between current maxPro and (prices[i] - minPrice)

public class CopyOfBestTimeToBuySellStock121 {
	public static int maxProfit(int[] prices) {
		int maxProfit  = 0;
        if(prices.length == 0 || prices.length == 1)
            return 0;
        else { 
        	int min = prices[0];
        	for(int i = 1; i < prices.length; i++) {
        		maxProfit = Math.max(maxProfit, prices[i] - min);
        		min = Math.min(min, prices[i]);
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
