public class Main {

    public static void main (String[] args) {
        int STRING_LENGTH = 10000;
        String word = StringGenerator.generateString(STRING_LENGTH);
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int total_substrings = solution.countSubstrings(word);
        long end = System.currentTimeMillis();
        long elapsed = end - start;
        System.out.println("Total palindromic substrings : " + total_substrings);
        System.out.println("It took " + elapsed + " ms.");
    }
}
