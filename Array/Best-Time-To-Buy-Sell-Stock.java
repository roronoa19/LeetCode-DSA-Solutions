class Solution {
    public int maxProfit(int[] prices) {
        int min= Integer.MAX_VALUE; 
        
        int max=0; 
        int profit=0; 
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]<min)
                min=prices[i];
            else if(prices[i]>min)
            {
                profit= prices[i] -min; 
                if(profit> max)
                    max=profit;
            }
        }
        return max;
    }
}