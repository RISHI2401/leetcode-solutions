got commit -m "Added Solution : 203 Remove Linked List Elements"class Solution:

    def halvesAreAlike(self, s:str) -> bool:

        vowels = set("aeiouAEIOU")
        count = 0

        for char in s[:len(s)//2]:
            if char in vowels:
                count += 1

        for char in s[len(s)//2:]:
            if char in vowels:
                count -= 1

                # early return
                if count < 0:
                    return False


        return count == 0

Solution = Solution()
print(Solution.halvesAreAlike("book"))
print(Solution.halvesAreAlike("textbook"))