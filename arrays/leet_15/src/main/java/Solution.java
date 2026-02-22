import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i ++) {
            int left_index = i + 1;
            int right_index = nums.length - 1;

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            while (left_index < right_index) {
                int sum = nums[i] + nums[left_index] + nums[right_index];
                if (sum == 0) {
                    output.add(Arrays.asList(nums[i], nums[left_index], nums[right_index]));
                    while (left_index < right_index && nums[left_index] == nums[left_index + 1]) {
                        left_index++;
                    }

                    while (left_index < right_index && nums[right_index] == nums[right_index - 1]) {
                        right_index--;
                    }

                    left_index++;
                    right_index--;
                } else if (sum < 0) {
                    left_index++;
                } else {
                    right_index--;
                }
            }
        }
        return output;
    }


}
