Problem description: Reverse first k elements of a queue

Solution:

1. Poll() first k elements of queue.
2. Push() those elements to a stack.
3. Pop() all the stack elements and add() them to the queue
4. Rotate the queue so that reverse elements are at the front
    4.1 Poll() from queue
    4.2 Add() to queue

Time complexity: O(n)
Space complexity: O(n) 
