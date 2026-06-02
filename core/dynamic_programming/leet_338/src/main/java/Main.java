import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        final int n = 1000000;
        Solution solution = new Solution();
        long then = System.currentTimeMillis();
        int[] response = solution.countBits(n);
        long now = System.currentTimeMillis();
        long elapsedMilis = now-then;
        System.out.println(Arrays.toString(response));
        System.out.println("Milis elapsed: " + elapsedMilis);
    }
}
