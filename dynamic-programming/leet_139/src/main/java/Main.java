import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        List<String> dict = new ArrayList<>();
        dict.add("leet");
        dict.add("code");
        String s = "leetcode";
        Solution solution = new Solution();
        System.out.println(solution.wordBreak(s, dict));
    }
}
