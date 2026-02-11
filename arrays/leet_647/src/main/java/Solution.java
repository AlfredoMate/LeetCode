public class Solution {


    /**
     * O(n²) solution
     * @param s String to coount palindromic substrings
     * @return number of palindromic substrings
     */
    public int countSubstrings(String s) {
        int total_substrings = 0;


        for (int i = 0; i < s.length(); i++) {
            //Case with string having even number of letters
            total_substrings += expandFromCenter(s, i, i);
            //Case with string having odd number of letters
            total_substrings += total_substrings + expandFromCenter(s, i, i + 1);

        }

        return total_substrings;
    }

    private int expandFromCenter (String s, int start_index, int end_index) {
        int palindromes_from_center = 0;
        while (start_index >= 0 && end_index < s.length() && s.charAt(start_index) == s.charAt(end_index)) {
            palindromes_from_center++;
            start_index--;
            end_index++;
        }
        return palindromes_from_center;
    }

    /**
     * Brute force solution. O(n³)
     * @param s String to coount palindromic substrings
     * @return number of palindromic substrings
     */
    public int countSubstringsBruteForce(String s) {

        int total_palindromes = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j+1))) {
                    total_palindromes++;
                }
            }
        }
        return total_palindromes;
    }

    boolean isPalindrome (String s) {
        int start_index = 0;
        int end_index = s.length() - 1;
        while (start_index <= end_index) {
            if (s.charAt(start_index) != s.charAt(end_index)) {
                return false;
            }
            start_index++;
            end_index--;
        }
        return true;
    }
}
