from typing import List

def function(nums: List[int]) -> List[int]:
    ans = [0, 0]
    n = len(nums)
    expected_sum = 0
    actual_sum = 0
    
    nums.sort()

    for i in range(n):
        expected_sum += i + 1
        actual_sum += nums[i]
    difference = expected_sum - actual_sum

    for i in range(n - 1):
        if nums[i] == nums[i+1]:
            ans[0] = nums[i]
            ans[1] = nums[i] + difference
    return ans

nums = [2,3,2]
ans = function(nums)
print(ans)
