class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        doubled = list(range(len(nums) * 2))
        for i in range(0, len(nums)):
            doubled[i] = nums[i]
            doubled[i + len(nums)] = nums[i]
        return doubled