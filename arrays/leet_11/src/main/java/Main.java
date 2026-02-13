import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int SIZE_ARRAY = 1000000;
        int[] my_array = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] big_array = new int[SIZE_ARRAY];
        for (int i = 0; i < big_array.length; i++) {
            big_array[i] = random.nextInt(100);
        }
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        System.out.println(solution.maxArea(big_array));
        long end = System.currentTimeMillis();
        long elapsed = end - start;
        System.out.println(elapsed + " ms.");
    }
}
