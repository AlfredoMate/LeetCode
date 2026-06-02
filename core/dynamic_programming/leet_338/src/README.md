Problem: Number of 1 from 0 to n, return result in array.

Solution: We can use dp, because number_1s(1011) = number_1s (101) + 1
ans[i] = ans[i>>1] + (i & 1)

Linear time and linear space.