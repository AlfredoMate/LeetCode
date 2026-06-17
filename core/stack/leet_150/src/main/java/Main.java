public class Main {

    public static void main (String[] args) {

        final String[] tokens_case_1 = new String[]{"2","1","+","3","*"};
        final String[] tokens_case_2 = new String[]{"4","13","5","/","+"};
        final String[] tokens_case_3 = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        final String[] tokens_case_4 = new String[]{"4", "3", "-"};
        Solution solution = new Solution();
        System.out.println("Case 1. Expected result = 9. Actual result = " + solution.evalRPN(tokens_case_1));
        System.out.println("Case 2. Expected result = 6. Actual result = " + solution.evalRPN(tokens_case_2));
        System.out.println("Case 3. Expected result = 22. Actual result = " + solution.evalRPN(tokens_case_3));
        System.out.println("Case 4. Expected result = 1. Actual result = " + solution.evalRPN(tokens_case_4));



    }
}
