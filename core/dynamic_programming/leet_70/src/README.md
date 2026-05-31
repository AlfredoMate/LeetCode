problem: distinct ways to climb n steps by 1/2 steps

solution: 

stairs[n] different ways to reach n steps by 1/2 combinations
stairs[3] = stairs[3-1] + stairs[3-2] (previous 2 steps from where we could arrive)

dynamic programing with bottom-up approach as we have sub-problems

time complexity = O(n)
space complexity O(1) we don't need an array as we only need to keep track of previous 2 steps