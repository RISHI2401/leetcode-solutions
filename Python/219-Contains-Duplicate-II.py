def containsNearbyDuplicate(nums : list[int], k : int) -> bool:

  hashmap = {}

  for index, num in enumerate(nums):

    if num in hashmap and index - hashmap[num] <= k:
      return True
    else:
      hashmap[num] = index

  return False
    
nums = [1,5,1,0]
k = 2
print(containsNearbyDuplicate(nums, k))