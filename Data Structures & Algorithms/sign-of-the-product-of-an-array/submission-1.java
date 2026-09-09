class Solution {
    public int arraySign(int[] nums) {
        double product = 1;
        for (int num : nums) {
            product *= (double) num;
        }
        if (product > 0.0) {
            return 1;
        } else if (product < 0.0) {
            return -1;
        } else {
            return 0;
        }
    }
}