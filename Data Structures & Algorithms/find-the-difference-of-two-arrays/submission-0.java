class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        int[] n1 = nums1.clone();
        int[] n2 = nums2.clone();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    n1[i] = -1001;
                    n2[j] = -1001;
                }
            }
        }
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] > -1001 && !num1.contains(n1[i])) num1.add(n1[i]);
        }
        for (int i = 0; i < n2.length; i++) {
            if (n2[i] > -1001 && !num2.contains(n2[i])) num2.add(n2[i]);
        }
        List<List<Integer>> res = Arrays.asList(num1, num2);
        return res;
    }
}