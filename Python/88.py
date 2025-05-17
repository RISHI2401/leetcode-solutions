def merge(nums1 : list[int], m:int, nums2 : list[int], n:int) -> list[int]:

  for i in range(n):
    nums1[m + i] = nums2[i]

  return sorted(nums1)

  # return nums1.sort(): The .sort() method sorts the list in place and returns None. 
  # So you're actually returning None, not the sorted list.


nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
# Output: [1,2,2,3,5,6]

answer = merge(nums1, m, nums2, n)
print(answer)
