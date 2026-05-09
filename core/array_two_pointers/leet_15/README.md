solution:

We first sort the array. Then, for each number we find the triplets with double pointers.

With double sum we cannot sort as it can be done with linear time. With triplets it makes sese to sort
as log (n) n is dominated by the n² of applying double pointer for each number.

Time complecity: n²
Space complexity: 1