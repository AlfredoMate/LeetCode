Problem: Recreate a Stack using a Queue

Solution: 

Only method that is different is push(). To recreate the stack, we need to put the element added at the front. To accomplish that, we add the element normally, and we rotate the queue until the element it's at front.

Push():

Time complexity: O(n) 
Space complexity: O(1) --> it's constant because it does not use more memory space than the structure itself.

Rest of methods are time and space constant.
