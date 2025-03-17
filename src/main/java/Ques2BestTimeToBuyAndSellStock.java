class Ques2BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        // Solution to be implemented by Avyaan
        return 0;
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {7, 1, 5, 3, 6, 4},
                {7, 6, 4, 3, 1},
                {1, 2, 3, 4, 5},
                {3, 2, 6, 5, 0, 3},
                {2, 4, 1},
                {2, 1, 2, 1, 2},
                {1, 2, 10, 1, 10},
                {1, 6, 7, 2, 3},
                {1, 9, 3, 10, 4},
                {2, 5, 1, 8, 6}
        };
        int[] expectedResults = {5, 0, 4, 4, 2, 1, 9, 6, 9, 7};

        for (int i = 0; i < testCases.length; i++) {
            int result = maxProfit(testCases[i]);
            System.out.println("Test " + (i + 1) + ": " + (result == expectedResults[i] ? "Passed" : "Failed"));
        }
    }
}