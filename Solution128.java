import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int currentLen = 0;
        int longestLen = 0;
        for (Integer num : numSet) {
            if (numSet.contains(num - 1)) {
                currentLen = 1;
            } else {
                int y = 1;
                for (; ; y++) {
                    if (!numSet.contains(num + y)) {
                        break;
                    }
                }
                currentLen = y;
            }
            longestLen = Math.max(currentLen, longestLen);
        }
        return longestLen;
    }
}
