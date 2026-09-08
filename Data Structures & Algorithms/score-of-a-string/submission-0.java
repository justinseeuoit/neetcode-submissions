class Solution {
    public int scoreOfString(String s) {
        char[] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length - 1; i++) {
            int a2 = (int) c[i+1];
            int a1 = (int) c[i];
            sum += Math.abs(a2 - a1);
        }
        return sum;
    }
}