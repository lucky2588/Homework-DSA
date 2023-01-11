import java.util.HashMap;
import java.util.Map;

public class B387 {
    public int firstUniqChar(String s) {
        int[] uniquee = new int[26];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            uniquee[c - 'a']++;
            if (map.keySet().size() < 26) {
                if (!map.containsKey(c)) {
                    map.put(c, i);
                }
            }
        }
        int minIdx = s.length();
        for (char c : map.keySet()) {
            if (uniquee[c - 'a'] == 1) {
                int idx = map.get(c);
                if (minIdx > idx) minIdx = idx;
            }
        }
        return minIdx == s.length() ? -1 : minIdx;
    }
}
