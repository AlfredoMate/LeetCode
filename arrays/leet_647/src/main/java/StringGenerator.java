import java.util.Random;

public class StringGenerator {

    public static String generateString(int string_length) {
        Random random = new Random();
        StringBuilder stringGenerated = new StringBuilder(string_length);
        for (int i = 0; i < string_length; i++) {
            stringGenerated.append((char) ('a' + random.nextInt(26)));
        }
        return stringGenerated.toString();
    }
}
