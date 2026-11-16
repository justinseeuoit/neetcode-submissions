class Solution:
    def minOperations(self, logs: List[str]) -> int:
        counter = 0
        for s in logs:
            if (s == "../"):
                if (counter > 0):
                    counter -= 1
            elif (s == "./"):
                continue
            else :
                counter += 1
        return counter