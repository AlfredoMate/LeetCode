public class Main {

    public static void main (String[] args) {


        int matrix1[][] = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrix2 = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        Solution solution = new Solution();
        System.out.println("V1: " + solution.spiralOrderV1(matrix2));
        System.out.println("V2: " + solution.spiralOrderV2(matrix2));
    }
}
