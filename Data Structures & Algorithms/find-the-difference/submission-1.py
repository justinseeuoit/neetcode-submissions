class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        sc = list(s)
        tc = list(t)
        sc.sort()
        tc.sort()
        for i in range(len(sc)):
            if tc[i] != sc[i]:
                return tc[i]
        return tc[len(tc) - 1]