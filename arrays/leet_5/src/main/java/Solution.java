public class Solution {

    /**
     * Not optimal solution. O(n³)
     * @param s
     * @return
     */
    public String longestPalindrome2(String s) {
        String longest_palindrome = "";
        String substring;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j ++) {
                substring = s.substring(i, j+1);
                if (isPalindrome(substring) && substring.length() > longest_palindrome.length()) {
                    longest_palindrome = substring;
                }
            }
        }
        return longest_palindrome;
    }

    public boolean isPalindrome (String s) {

        if (s.length() == 1) {
            return true;
        }
        int start_index = 0;
        int end_index = s.length() - 1;
        while (start_index < end_index) {
            if (s.charAt(start_index) != s.charAt(end_index)) {
                return false;
            }
            start_index ++;
            end_index --;
        }
        return true;
    }

    /**
     * O(n²) solution
     *
     */

    public String longestPalindrome(String s) {

        String longest_palindrome = "";
        String current_palindrome;
        int right_index;
        int left_index;

        for (int i = 0; i < s.length(); i++) {
            left_index = right_index = i;
            while (left_index >= 0 && right_index < s.length() && s.charAt(left_index) == s.charAt(right_index)) {
                left_index--;
                right_index++;
            }

            current_palindrome = s.substring(left_index + 1, right_index);
            if (current_palindrome.length() > longest_palindrome.length()) {
                longest_palindrome = current_palindrome;
            }

            left_index = i;
            right_index = i + 1;
            while (left_index >= 0 && right_index < s.length() && s.charAt(left_index) == s.charAt(right_index)) {
                left_index--;
                right_index++;
            }

            current_palindrome = s.substring(left_index + 1, right_index);
            if (current_palindrome.length() > longest_palindrome.length()) {
                longest_palindrome = current_palindrome;
            }
        }

        return longest_palindrome;
    }
}
