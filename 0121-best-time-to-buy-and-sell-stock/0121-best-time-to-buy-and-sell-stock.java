class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int lowPrice = Integer.MAX_VALUE;
        for(int p : prices) {
            lowPrice = Math.min(lowPrice, p);
            answer = Math.max(answer, p - lowPrice);
        }
        return answer;
    }
}