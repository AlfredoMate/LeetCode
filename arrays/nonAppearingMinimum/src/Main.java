import java.util.Arrays;

class Main {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		int[] arr = new int[] {1, 3, 6, 4, 1, 2};
		int[] arr2 = new int[] {1, 2, 3};
		System.out.println(Arrays.toString(arr));
		System.out.println(solution.min(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(solution.min(arr2));
	}
}
