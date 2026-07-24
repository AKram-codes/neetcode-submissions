class Solution {
    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int maxP = 0;
        for (int price : prices){
            if(price < minP){
                minP = price;
            }else if(price-minP > maxP){
                maxP = price-minP;
            }
        }
        return maxP;
    }
}
