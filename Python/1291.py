from typing import List

def sequentialDigits(low: int, high: int) -> List[int]:
    result = []
    for i in range(1, 10):  # to include 9
        num = i
        nextDigit = i + 1

        while num <= high and nextDigit <= 9:
            num = num * 10 + nextDigit
            if low <= num <= high:
                result.append(num)
            nextDigit += 1
    return sorted(result)

ans = sequentialDigits(100, 300)
print(ans)
