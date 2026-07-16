import java.util.Arrays;

class Solution {


	//Given an array of integers, return the smallest positive integer that does not appear in the array.	
		
	public int min(int[] arr) {
	
		Arrays.sort(arr); //O(n log n)

		int expected = 1;

		for (int num : arr) {

			if (num < expected) {
				continue;
			}
			if (num == expected) {
				expected = expected + 1;
			
			} else {
				return expected;
			}
		}
		return expected;		
	}
}
