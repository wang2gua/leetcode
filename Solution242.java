public class Solution242 {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        int[] ccs = new int[26];
        int[] cct = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ccs[s.charAt(i)-'a']++;
            cct[t.charAt(i)-'a']++;
        }

        for (int i = 0; i < ccs.length; i++) {
            if (ccs[i] != cct[i]) {
                return false;
            }
        }

        return true;
    }
}
