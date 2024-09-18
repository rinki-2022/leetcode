import java.util.Arrays;

public class DistributeCandies {

    public static int candy(int[] ratings) {
        int n = ratings.length;

        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        //left pass
        for (int i=1; i< ratings.length;i++){
            if(ratings[i]> ratings[i-1]) {
                candies[i] = candies[i-1] + 1;
            }
        }

        //right pass
        for (int i= n-2 ; i>=0 ;i--){
            if(ratings[i]> ratings[i+1]) {
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }
        int totalCandies = 0;
        for (int candy: candies){
            totalCandies += candy;
        }
        return totalCandies;
    }

    public static void main(String[] args) {
        int[] ratings1 = {1, 0, 2};
        System.out.println(candy(ratings1));  // Output: 5

        int[] ratings2 = {1, 2, 2};
        System.out.println(candy(ratings2));  // Output: 4
    }
}
