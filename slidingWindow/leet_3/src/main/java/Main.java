public class Main {

    public static void main (String[] args) {

        Solution solution = new Solution();
        int max_substring = solution.lengthOfLongestSubstring(ProblemGeneratorService.createString());
        System.out.println(max_substring);
    }
}
