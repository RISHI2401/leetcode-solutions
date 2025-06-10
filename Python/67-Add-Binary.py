def addBinary(a : str, b : str) -> str:

  result = ""
  carry = 0

  i = len(a) - 1
  j = len(b) - 1

  while i >= 0 or j >= 0 or carry:

    # Getting the digits
    digit_a = int(a[i]) if i >= 0 else 0
    digit_b = int(b[j]) if j >= 0 else 0

    # Now adding them up
    total = digit_a + digit_b + carry

    #Updating result and carry
    result = str(total % 2) + result
    carry = total // 2

    i-=1
    j-=1
    
  return result
  
# Example case

a = "1010"
b = "1011"

print(addBinary(a, b)) #Output: "10101"