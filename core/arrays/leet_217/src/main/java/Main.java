import java.util.Random;

public class Main {
    public static void main (String[] args) {

        final int ARRAY_SIZE = 100000000;
        final int MAX_NUM_SIZE = 1000000000;
        int[] nums = new int[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            int random_number = random.nextInt(MAX_NUM_SIZE);
            nums[i] = random_number;
        }
        //nums = new int[]{1,1,1,3,3,4,3,2,4,2};

        Solution solution = new Solution();
        System.out.println("Algorithm begins");
        long now = System.currentTimeMillis();
        System.out.println(solution.containsDuplicate(nums));
        long then = System.currentTimeMillis();
        long total_time = then - now;
        System.out.println("Algorithm ends. " + total_time + " milliseconds." );
    }
}
