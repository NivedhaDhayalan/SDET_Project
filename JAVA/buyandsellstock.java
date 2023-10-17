package javaprograms;

public class buyandsellstock {
	    public static void main(String args[])
	    {
	        int prices[] = { 7, 1, 5, 6, 4 };
	        int n = prices.length;
	        
	        int max_profit = maxProfit(prices, n);

	        System.out.println(max_profit);
	    }
		private static int maxProfit(int[] prices, int n) {
			 {
			        int buy = prices[0], max_profit = 0;
			        int buy_day =0, sell_day =0;   
			        for (int i = 1; i < n; i++) {
			 
			            // Checking for lower buy value
			            if (buy > prices[i]) {
			                buy = prices[i];
			                buy_day = i;
			            }  
			           
			            // Checking for higher profit
			            else if(prices[i] - buy > max_profit) {
			                max_profit = prices[i] - buy;
			                sell_day = i;
			           }  
			        }
			        System.out.println("buy_day="+buy_day+"Sell_day="+sell_day+"max_profit="+max_profit);       
			    
					return max_profit;}
			 
			       
		}
	
        }		 
			
		

	

