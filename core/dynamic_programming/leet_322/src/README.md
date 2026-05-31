Problem: minimum coin combinations to get to target

Solution: 

Problem can we reduced to smaller subproblems. coin(amount) minimum number of coins to amount

Approach: bottom-up dp, we save each solution starting from coin(0) = 0

Linear space and time complexity
Space complexity: O(amount)
Time complexity: O(amount x coins)