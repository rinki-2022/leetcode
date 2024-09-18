import java.util.Arrays;

public class ShortestDistanceToCharacter {
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] shortestDistanceArr = new int[n];
        Arrays.fill(shortestDistanceArr, Integer.MAX_VALUE);
        int tempDistance = -n;
        System.out.println(Arrays.toString(shortestDistanceArr));
        //left to right
        for (int i =0; i< n ;i++){
            if (s.charAt(i) == c) {
                tempDistance = i;
            }
            shortestDistanceArr[i] = i - tempDistance;
        }
        System.out.println(Arrays.toString(shortestDistanceArr));

        //right to left
        tempDistance = 2*n;
        for (int i = n-1; i>=0 ;i--){
            if (s.charAt(i) == c) {
                tempDistance = i;
            }
            shortestDistanceArr[i] = Math.min(shortestDistanceArr[i], tempDistance - i);
        }

       return shortestDistanceArr;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] result = shortestToChar(s, c);
        System.out.println(Arrays.toString(result)); // Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
    }
}
