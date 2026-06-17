import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> rpn_stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int operand_1 = rpn_stack.pop();
                int operand_2 = rpn_stack.pop();
                switch (token) {
                    case "+" -> rpn_stack.push(operand_2 + operand_1);
                    case "-" -> rpn_stack.push(operand_2 - operand_1);
                    case "*" -> rpn_stack.push(operand_2 * operand_1);
                    case "/" -> rpn_stack.push(operand_2 / operand_1);
                }

            } else {
                rpn_stack.push((Integer.parseInt(token)));
            }
        }
        return rpn_stack.pop();
    }
}