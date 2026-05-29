public class Main {

    public static void main (String[] args) {
        final int NUMBER = 45;
        Solution solution = new Solution();
        System.out.println("--- Not using dynamic programming ---");
        long then = System.currentTimeMillis();
        System.out.println("result: " + solution.fibNoDynamicProgramming(NUMBER));
        long now = System.currentTimeMillis();
        System.out.println("time: " + (now-then) + " milis");
        System.out.println("--- Using dynamic programming ---");
        then = System.currentTimeMillis();
        System.out.println("result: " + solution.fib(NUMBER));
        now = System.currentTimeMillis();
        System.out.println("time: " + (now-then) + " milis");

    }
}
