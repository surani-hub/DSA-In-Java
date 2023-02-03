package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
    //    String s = "dinitrophenylhydrazinetrinitrophenylmethylnitramine", p = "trinitrophenylmethylnitramine";
        String s= "cbaebabacd", p ="abc";
        System.out.println(findAnagrams(s, p));
    }

    static public List<Integer> findAnagrams(String s, String p) {
        int len1 = s.length(), len2 = p.length();
        List<Integer> ans = new ArrayList<>();
        if (len1 < len2) {
            return ans;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len2; i++) {
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }
        int windowSize = len2;
        int left = 0, right = 0;
        while (right < len1) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                int frequency = map.get(c);
                map.put(c, frequency - 1);
                if (frequency > 0) {
                    windowSize--;
                }
            }
            right++;
            if ((right - left) == len2) {
                char c1 = s.charAt(left);
                if (map.containsKey(c1)) {
                    int freq = map.get(c1);
                    map.put(c1, freq + 1);
                    if (freq == 0 ) {
                        windowSize++;
                    }
                }
                left++;
            }
            if (windowSize == 0) {
                ans.add(left);
            }
        }
        return ans;
    }
}
