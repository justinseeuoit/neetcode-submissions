class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> doubled = nums;
        for (int i = 0; i < nums.size(); i++) {
            doubled.push_back(nums[i]);
        }
        return doubled;
    }
};