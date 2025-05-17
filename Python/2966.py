from typing import List

def divideArray(nums: List[int], k: int) -> List[List[int]]:
    nums.sort()
    result = []
    is_possible = True
    for i in range(0, len(nums)-2, 3):
        first, second, third = nums[i], nums[i+1], nums[i+2]
        if third - first <= k:
            result.append([first, second, third])
        else:
            is_possible = False
            break
    if not is_possible:
        return []
    return result

nums_list = [1, 2, 5, 4, 2, 3, 5, 6, 7]
ans = divideArray(nums_list, 2)
print(ans)
