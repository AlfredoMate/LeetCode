import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set_window = new HashSet<>();

        int start = 0, end = 0, max_substring = 0;

        while (end < s.length()) {
            if (!set_window.contains(s.charAt(end))) {
                set_window.add(s.charAt(end));
                end++;
                max_substring = Math.max(max_substring, set_window.size());
            } else {
                set_window.remove(s.charAt(start));
                start++;
            }
        }

        return max_substring;
    }
}
