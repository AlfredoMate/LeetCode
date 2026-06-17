import java.util.Stack;

public class Solution {

    private char pop;

    public boolean isValid (String s) {

        Stack<Character> opened = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '[' || character == '(' || character == '{') {
                opened.push(character);
            } else {
                if (opened.isEmpty()) {
                    return false;
                }
                pop = opened.pop();
                if (character == ']' && pop != '[') {
                    return false;
                }
                if (character == ')' && pop != '(') {
                    return false;
                }
                if (character == '}' && pop != '{') {
                    return false;
                }

            }
        }

        return opened.isEmpty();
    }
}