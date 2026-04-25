import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Solution {

    public boolean isValid (String s) {
        Deque<Character> parentheses = new ArrayDeque<>();

        HashMap<Character, Character>  parentheses_touples = new HashMap<>();
        parentheses_touples.put(')', '(');
        parentheses_touples.put(']', '[');
        parentheses_touples.put('}', '{');


        for (char c : s.toCharArray()) {
            if (parentheses_touples.containsKey(c)) {
                if (parentheses.isEmpty() || parentheses.peek() != parentheses_touples.get(c)) {
                    return false;
                }
                parentheses.pop();
            } else {
                parentheses.push(c);
            }
        }

        return parentheses.isEmpty();
    }
}
