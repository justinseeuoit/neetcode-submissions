class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] doubled = new int [nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            doubled[i] = nums[i];
            doubled[i + nums.length] = nums[i];
        }
        return doubled;
    }
}