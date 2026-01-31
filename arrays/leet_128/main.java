import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class main {



	public static void main(String[] args) {

		int[] my_array = ProblemGeneratorService.createFullArray();
		int longest_sequence = Solution.longestConsecutive(my_array);
		System.out.println("Longest sequence: " + longest_sequence);

	}
}
