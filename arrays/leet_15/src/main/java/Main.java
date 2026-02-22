import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Main {

    public static void main (String[] args) throws IOException{



        Solution solution = new Solution();
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));

    }
}
