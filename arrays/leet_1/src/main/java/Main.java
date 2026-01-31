import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
        Solution solution = new Solution();
        int[] array_solution = solution.twoSum(ProblemGeneratorService.createArray(), 9);
        System.out.println(Arrays.toString(array_solution));
    }
}
