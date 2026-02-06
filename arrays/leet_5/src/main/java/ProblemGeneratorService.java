public class ProblemGeneratorService {



    public static String createString() {
        int MAX_LENGTH = 10000;
        String substring = "aba";
        StringBuilder s = new StringBuilder();
        while (s.length() < MAX_LENGTH) {
            s.append(substring);
        }
        return s.toString();
    }
}
