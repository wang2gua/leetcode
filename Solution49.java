import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

public class Solution49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String k = generateK(str);
            if (map.containsKey(k)) {
                map.get(k).add(str);
            } else {
                List<String> strings = new ArrayList<>();
                strings.add(str);
                map.put(k, strings);
            }
        }

        return map.values().stream().toList();
    }

    String generateK(String str) {
        int[] cc = new int[26];

        for (int i = 0; i < str.length(); i++) {
            cc[str.charAt(i) - 'a']++;
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < cc.length; i++) {
            sb.append(cc[i]);
            sb.append("#");
        }

        return sb.toString();
    }
}
