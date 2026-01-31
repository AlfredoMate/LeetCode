import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProblemGeneratorService {
    final static int ARRAY_SIZE = 10;
    final static int MAX_NUM = 25;

    public static int[] createFullArray () {

        int[] my_array = new int[ARRAY_SIZE];
        Random random = new Random();
        System.out.println("Starting creating array with " + ARRAY_SIZE + " elements");
        long start = System.currentTimeMillis();
        for (int i = 0; i < ARRAY_SIZE; i++) {

            my_array[i] = ThreadLocalRandom.current().nextInt(0, MAX_NUM);
        }
        long end = System.currentTimeMillis();
        long total_milis = end - start;
        System.out.println("Ended creating array with " + ARRAY_SIZE + " elements in " + total_milis + " milis" );

        for (int i = 0; i < my_array.length; i++) {
            System.out.println("Index " + i + " --> " + my_array[i]);
        }
        return my_array;
    }
}
