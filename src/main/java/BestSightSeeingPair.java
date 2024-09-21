public class BestSightSeeingPair {

    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int maxPrefix = values[0];

        for (int j=1 ; j < values.length; j++) {
            maxScore = Math.max (maxScore, maxPrefix + values[j] - j);
            maxPrefix = Math.max (maxPrefix, values[j] + j);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        BestSightSeeingPair solution = new BestSightSeeingPair();

        int[] values = {8, 1, 5, 2, 6};
        int result = solution.maxScoreSightseeingPair(values);

        // Expected output: 11
        System.out.println("Maximum score: " + result);
    }
}
