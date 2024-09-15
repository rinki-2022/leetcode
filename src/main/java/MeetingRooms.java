import java.util.Arrays;

public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals) {

        if (intervals.length == 0){
            return true;
        }

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(intervals));

        for (int i=1; i< intervals.length;i++){
            if(intervals[i][0] < intervals[i-1][1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
      //  int[][] intervals = { {0, 30}, {5, 10}, {15, 20} , {18,40}, {12,14}};
        int[][] intervals = { {0, 3}, {5, 10}, {15, 20} };
        System.out.println(canAttendMeetings(intervals));
    }
}
