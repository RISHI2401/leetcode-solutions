def canConstruct(ransomNote : str, magazine : str)-> bool:
  map = {}
  for char in magazine:
    if char in map:
      map[char] += 1
    else:
      map[char] = 1
    
  for char in ransomNote:
    if char in map and map[char] > 0:
      map[char] -= 1
    else:    
      return False
  
  return True


ransomNote = "aabb"
magazine = "aab"
answer = canConstruct(ransomNote, magazine)
print(answer)