def reverseString(s : str) -> None:

  left, right = 0, len(s)-1
  while left < right:
    s[left], s[right] = s[right], s[left]
    left += 1
    right -= 1 
  print(s)

s = ['h', 'e', 'l', 'l', 'o']
reverseString(s)

'''
We could have also used brute force by simply creating a copy of list and change the
original list in place using the reference, but that would not be the optimal solution, 
in fact that would be incorrect cause we have to keep the space complexity O(n) and that
would break that constrain. 
'''