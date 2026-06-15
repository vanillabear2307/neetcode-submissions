class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int best=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            best=Math.max(best,prices[i]-min);
            }
            return best;
        }
    }
