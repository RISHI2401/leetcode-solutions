# Let's say we are finding the index of a target value using binary search where the array is sorted

def binary_search(nums : list, target) -> int:
  left = 0
  right = len(nums) - 1

  while left <= right:
    mid = (left + right) // 2

    if nums[mid] == target:
      return mid
    
    elif target < nums[mid]:
      right = mid - 1
    else:
      left = mid + 1

  return -1
    
nums = [2,3,4,5,6,7,8]
print(binary_search(nums, 8))