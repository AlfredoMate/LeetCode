Problem: Return new list, where for each nums[i] in original list, the value of the new list is the total of numbers nums[i] is bigger than.

Solution:

Instead of iteration twice (square time complexity). Sort the list (n*log n) and save in a hashmap
the value:index without repeating numbers. Then return a list where for every number in the original list, an index lookup in the dorted list is performed and the value reurned.

Time complexity: log n * n
Space complexity: n