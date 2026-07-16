Problem: Given an array of integers, return the smallest positive integer that does not appear in the array.

Solution:

Sort array.
Always compare current num with current expected next minumum. If we they are equal, expected++;
If it's smaller, continue. This is key to handle duplicates. 
If it's different (else statement so it's bigger than next min we are looking for) we return expected number.

Time complexity: O(n log n) sorting

Space complexity: O(1) although the sorting method uses log n stack

