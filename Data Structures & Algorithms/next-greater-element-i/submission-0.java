class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int [nums1.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < nums1.length; i++) {
            boolean indexFound = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    indexFound = true;
                }
                if (nums2[j] > nums1[i] && indexFound) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}