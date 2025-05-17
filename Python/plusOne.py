def plusOne(digits : list[int]) -> list[int]:
  '''
  s = [str(num) for num in digits]
  s = "".join(s)
  ans = str(int(s) + 1)

  answer = [int(digit) for digit in ans]
  return answer
  '''

  for i in range(len(digits)-1, -1, -1):
    if digits[i] < 9:
      digits[i] += 1
      return digits
    digits[i] = 0 #carry over

    # assuming all are 9's
    return [1] + [0] * len(digits)

  

digits = [1,2,3]
# Output : 123 + 1 = 124 -> [1,2,4]
answer = plusOne(digits)
print(answer)