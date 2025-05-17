def subarraySum(nums : list, k : int) -> int:\

  count = 0
  current_sum = 0
  prefix_sum = {0:1}

  for num in nums:
    current_sum += num
    count += prefix_sum.get(current_sum-k, 0)
    prefix_sum[current_sum] = prefix_sum.get(current_sum, 0) + 1

  return count 

print(subarraySum([1,1,1], 2))       # Output: 2
print(subarraySum([1,2,3], 3))       # Output: 2 ([1,2] and [3])
