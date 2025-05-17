def searchRange(nums: list, target : int) -> list:

  def find_bound(is_first : bool) -> bool:

    left, right = 0, len(nums)-1
    bound = -1

    while left <= right:
      mid = (left+right) // 2

      if nums[mid] == target:
        bound = mid

        if is_first:
          right = mid-1
        else:
          left = mid+1
      
      elif nums[mid] < target:
        left = mid+1
      else:
        right = mid-1

    return bound
  
  return[find_bound(True), find_bound(False)]

print(searchRange([5,7,7,8,8,10], 8))   # Output: [3, 4]
print(searchRange([5,7,7,8,8,10], 6))   # Output: [-1, -1]

