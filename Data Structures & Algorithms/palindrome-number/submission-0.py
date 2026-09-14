class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        z = s[::-1]
        if s == z: return True
        return False