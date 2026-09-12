class Solution {
    public static double factorial(int n) {
        if (n == 0)
            return 1;

        return (double) n * factorial(n - 1);
    }
    public int uniquePaths(int m, int n) {
        return (int) (factorial(m+n-2)/(factorial(m-1)*factorial(n-1)));
    }
}
