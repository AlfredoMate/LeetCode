import java.util.*;

class Solution {
    List<String> allPermutedCombinations = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {

        char[] arr = s.toCharArray();
        dfs(arr, 0);
        return allPermutedCombinations;
    }

    public void dfs (char[] originalString, int index) {

        if (index == originalString.length) {
            allPermutedCombinations.add(new String(originalString));
            return;
        }
        if (Character.isDigit(originalString[index])) {
            dfs(originalString, index + 1);
            return;

         }

        originalString[index] = Character.toLowerCase(originalString[index]);
        dfs (originalString, index + 1);
        originalString[index] = Character.toUpperCase(originalString[index]);
        dfs (originalString, index + 1);

    }
}