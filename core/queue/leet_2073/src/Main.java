class Main {

	public static void main (String[] args) {
		int[] tickets_test_1 = new int[]{2,3,2};
		final int k_test_1 = 2;
		int[] tickets_test_2 = new int[]{5,1,1,1};
		final int k_test_2 = 0;
		Solution solution = new Solution();
		System.out.println("Expected: 6. Real: " + solution.timeRequiredToBuy(tickets_test_1, k_test_1));
		System.out.println("Expected: 8. Real: " + solution.timeRequiredToBuy(tickets_test_2, k_test_2));
		
	}
}
