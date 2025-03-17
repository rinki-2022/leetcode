class Ques2BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i=0; i< prices.length; i++){
            minValue = Math.min(prices[i] , minValue);
            maxProfit = Math.max(prices[i] - minValue, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] testCase = {7, 1, 5, 3, 6, 4};
        int expectedResult = 5;

        int result = maxProfit(testCase);
        System.out.println("Test 1: " + (result == expectedResult ? "Passed" : "Failed"));
    }

}