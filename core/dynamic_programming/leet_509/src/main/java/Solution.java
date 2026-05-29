import java.util.HashMap;

class Solution {

    HashMap<Integer, Integer> knownFib = new HashMap<>();

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (knownFib.containsKey(n)) {
            return knownFib.get(n);
        } else {
            int result = fib(n-2) + fib(n-1);
            knownFib.put(n, result);
            return result;
        }
    }





    public int fibNoDynamicProgramming(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibNoDynamicProgramming(n-2) + fibNoDynamicProgramming (n-1);
    }
}