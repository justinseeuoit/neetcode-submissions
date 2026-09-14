class Solution {
    public boolean isPerfectSquare(int num) {
        int n = 0;
        int i = 0;
        while (n < num) {
            i++;
            n = i * i;
            if (n == num) return true;
        }
        return false;
    }
}