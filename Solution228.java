import java.util.ArrayList;
import java.util.List;

public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ) {
            int start = i;
            int end = i;
            for (; end < nums.length; end++) {
                if (end == nums.length - 1 || nums[end + 1] != nums[end] + 1) {
                    break;
                }
            }
            if (start == end) {
                res.add(String.valueOf(nums[start]));
            } else {
                res.add(nums[start] + "->" + nums[end]);
            }
            i = end + 1;
        }
        return res;
    }
}
