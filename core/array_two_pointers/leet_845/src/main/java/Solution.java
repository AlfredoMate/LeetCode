class Solution {
    public int longestMountain(int[] arr) {

        int longestMountain = 0;

        if (arr.length < 3) {
            return 0;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i-1] < arr[i] && arr[i+1] < arr[i]) {
                int left = i - 1;
                int right = i + 1;

                while (left > 0) {
                    if (arr[left - 1] < arr[left]) {
                        left--;
                    } else {
                        break;
                    }
                }

                while (right < arr.length - 1) {
                    if (arr[right + 1] < arr[right]) {
                        right++;
                    } else {
                        break;
                    }
                }

                longestMountain = Math.max(longestMountain, right - left + 1);
            }


        }
        return longestMountain;
    }
}