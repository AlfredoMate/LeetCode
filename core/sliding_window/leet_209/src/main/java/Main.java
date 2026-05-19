public class Main {

    public static void main(String[] args) {

        int[] nums = new int[] {2,3,1,2,4,3};
        final int TARGET = 7;
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(TARGET, nums));
    }
}
