class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isReversed = false;
        if (nums[0] > nums[1]) {
            isReversed = true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (isReversed) {
                if (nums[i] < nums[i+1]) return false;
            } else {
                if (nums[i] > nums[i+1]) return false;
            }
            
        }
        return true;
    }
}