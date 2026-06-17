Problem: Implement min value stack

Solution:

Create manual stack. Every push, a node is introduced before head. Each now has a min field where it keeps track of the min value so far.

Time complexity: O(1)
Space complexity: O(n) One node for every member