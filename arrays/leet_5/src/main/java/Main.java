public class Main {

    public static void main (String[] args) {

        Solution solution = new Solution();
        String s = ProblemGeneratorService.createString();
        long start = System.nanoTime();
        String longest_palindrome = solution.longestPalindrome(s);
        //String longest_palindrome = solution.longestPalindrome2(s);
        long end = System.nanoTime();
        long total = end - start;
        total = total / 1000000;
        System.out.println("It took " + total + " miliseconds");
        System.out.println(longest_palindrome);
    }
}
