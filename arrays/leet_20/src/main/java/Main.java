public class Main {

    public static void main (String [] args) {

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";
        String s5 = "([)]";
        String s6 = "]";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s1));
    }
}
