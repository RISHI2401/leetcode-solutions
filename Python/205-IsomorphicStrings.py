def isIsomorphic(s : str, t : str) -> bool:

  if len(s)!=len(t):
    return False
  
  s_to_t = {}
  mapped_t = set()

  for char_s, char_t in zip(s, t):
    if char_s in s_to_t:
      if s_to_t[char_s] != char_t:
        return False
      
    else:
      if char_t in mapped_t:
        return False
      
    s_to_t[char_s] = char_t
    mapped_t.add(char_t)

  return True
  

s = "bbbaaaba"
t = "aaabbbba" 
result = isIsomorphic(s, t)
print(result)

'''

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

'''