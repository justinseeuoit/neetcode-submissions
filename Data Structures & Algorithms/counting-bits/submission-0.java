class Solution {
    public int[] countBits(int n) {
        int [] output = new int [n+1];
        for (int i = 0; i <= n; i++) {
            output[i] = hammingWeight(i);
        }
        return output;
    }
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((1 << i & n) != 0) {
                result++;
            }
        }
        return result;
    }
}
