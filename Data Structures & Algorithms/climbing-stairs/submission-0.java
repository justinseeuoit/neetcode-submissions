class Solution {
    public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5)/2;
        int m = n + 1;
        int nthTerm = (int) ((Math.pow(phi, m) - Math.pow(-phi, -m))/sqrt5);
        return nthTerm;
    }
}
