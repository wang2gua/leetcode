import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {

        List<int[]> temp = new ArrayList<>(Arrays.stream(intervals).toList());


        temp.sort(Comparator.comparingInt(x -> x[0]));

        for (int i = 1; i < temp.size(); ) {
            if (temp.get(i)[0] <= temp.get(i - 1)[1]) {
                temp.get(i - 1)[1] = Math.max(temp.get(i)[1], temp.get(i - 1)[1]);
                temp.remove(i);
            } else {
                i++;
            }
        }

        int[][] nums = new int[temp.size()][2];

        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }

        return nums;
    }

    // Test the code
    public static void main(String[] args) {
        Solution56 s = new Solution56();
        int[][] array = {
                {1, 2},
                {2, 4}
        };
        s.merge(array);
    }
}

