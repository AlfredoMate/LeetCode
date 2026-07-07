Problem: Time needed to buy tickets for position k in a queue

Solution:

We iterate once the array, adding to time variable the number of times that position will buy the ticket. -1 time if you are behind postion k. 

Example: times behind k postion: min (tickets[i], tickets[k] - 1) 

Time complexity: O(n)
Space complexity: O(1)
