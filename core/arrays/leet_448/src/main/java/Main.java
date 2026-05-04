import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        int[] nums = new int[] {4,3,2,7,8,2,3,1};
        Solution solution = new Solution();
        List<Integer> disappearedNumbers = new ArrayList<>();
        disappearedNumbers = solution.findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
}
