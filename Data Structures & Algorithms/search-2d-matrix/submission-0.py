class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        one = list(chain.from_iterable(matrix))
        for num in one:
            if (num == target):
                return True
        return False