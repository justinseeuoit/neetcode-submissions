class Solution:
    def largestGoodInteger(self, num: str) -> str:
        nums = list(num)
        highest = -1
        for i in range(1, len(num)-1):
            if nums[i] == nums[i-1] == nums[i+1] and int(nums[i]) > highest:
                highest = int(nums[i])
        
        if (highest < 0): return ""
        elif (highest == 0): return "000"
        else: return str(highest * 111)