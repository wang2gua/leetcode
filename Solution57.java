import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        boolean alreadyInsert = false;

        List<int[]> resL = new ArrayList<>();


        for (int[] interval : intervals) {
            if (alreadyInsert) {
                resL.add(interval);
            } else if (interval[1] < newInterval[0]) {
                resL.add(interval);
            } else if (interval[0] > newInterval[1]) {
                resL.add(newInterval);
                resL.add(interval);
                alreadyInsert = true;
            } else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        if(!alreadyInsert){
            resL.add(newInterval);
        }

        return resL.toArray(int[][]::new);
    }
}
