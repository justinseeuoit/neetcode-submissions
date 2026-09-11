class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        u = list(s)
        v = list(t)
        u.sort()
        v.sort()
        return u == v