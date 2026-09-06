class Solution:
    def isAlreadyValid(self, nums: List[int]) -> bool:
        isSorted = True
        for num in nums:
            if (num % 2 == 1):
                return False
        return True
    
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        i = 0
        j = 0

        if self.isAlreadyValid(nums):
            return nums

        while (i < len(nums)):
            if (nums[i] % 2 == 0):
                w = nums[i]
                nums[i] = nums[j]
                nums[j] = w
                del w
                i += 1
                j += 1
            else:
                i += 1
        
        return nums