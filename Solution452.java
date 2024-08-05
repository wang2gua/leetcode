import java.util.Arrays;
import java.util.Comparator;

// 贪心法
public class Solution452 {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int res = 1;
        int shoot = points[0][1];

        for (int i = 1; i < points.length;i++) {
            if (shoot < points[i][0]) {
                res++;
                shoot = points[i][1];
            }
        }
        return res;
    }

}
