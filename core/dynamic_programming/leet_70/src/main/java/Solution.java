class Solution {
    public int climbStairs(int n) {

       int prev2 = 2;
       int prev1 = 1;

       if (n <= 2) {
           return n;
       }
       int current = 3;

       while (current <= n) {
            int temp = prev2;
            prev2 = prev2 + prev1;
            prev1 = temp;
            current++;
       }
       return  prev2;
    }
}