class Solution:
    def search(self, nums: List[int], target: int) -> int:
        mid = len(nums) // 2
        if len(nums) == 0:
            return -1
        if nums[mid] == target:
            return mid
        if nums[mid] > target:
            return self.search(nums[:mid], target)
        else:
            result = self.search(nums[mid + 1:], target)

            if result == -1:
                return -1

            return mid + 1 + result