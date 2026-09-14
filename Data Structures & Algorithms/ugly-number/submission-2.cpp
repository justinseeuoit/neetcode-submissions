class Solution {
public:
    bool isUgly(int n) {
        while (true) {
            int prev = n;
            if (n % 2 == 0) n /= 2;
            if (n % 3 == 0) n /= 3;
            if (n % 5 == 0) n /= 5;
            if (prev == n) break;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }
};