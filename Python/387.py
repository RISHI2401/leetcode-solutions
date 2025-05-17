from collections import Counter


def firstUniqChar(s:str) -> int:
    char_count = {}

    for char in s:
        char_count[char] = char_count.get(char, 0) + 1
    for i, char in enumerate(s):
        if char_count[char] == 1:
            return i
    return -1
    
s1 = "leetcode"
s2 = "loveleetcode"
s3 = "aabb"

print(firstUniqChar(s1))
print(firstUniqChar(s2))
print(firstUniqChar(s3))

