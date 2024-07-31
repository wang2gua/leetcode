import java.util.HashMap;
import java.util.Map;

public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        // pattern = charSet
        // strs = stringSet
        String[] strs = s.split(" ");

        if (strs.length != pattern.length()) {
            return false;
        } else {
            int n = strs.length;

            for (int i = 0; i < n; i++) {
                char chr = pattern.charAt(i);
                String str = strs[i];

                if (map1.containsKey(chr)) {
                    if (!map1.get(chr).equals(str)) {
                        return false;
                    }
                } else {
                    map1.put(chr, str);
                }

                if (map2.containsKey(str)) {
                    if (!map2.get(str).equals(chr)) {
                        return false;
                    }
                } else {
                    map2.put(str, chr);
                }
            }
        }
        return true;
    }
}
