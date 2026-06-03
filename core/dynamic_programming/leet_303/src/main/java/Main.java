public class Main {

    public static void main (String[] args) {

        final int LEFT = 1;
        final int RIGHT = 3;

        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(LEFT, RIGHT);
        System.out.println(param_1);

    }
}
