def isValid(s: str) -> bool:
  stack = []
  mapping = {')' : '(', ']' : '[', '}' : '{'}

  for char in s:
    if char in mapping.values():
      stack.append(char)
    elif char in mapping:
      if not stack or stack[-1] != mapping[char]:
        return False
      stack.pop()
    else:
      return True 
    
  return not stack





print(isValid("()[]{}"))      # True
print(isValid("([{}])"))      # True
print(isValid("([)]"))        # False
print(isValid("("))           # False
print(isValid("{[]}"))        # True

      