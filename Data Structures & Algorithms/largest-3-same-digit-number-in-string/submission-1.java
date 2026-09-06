class Solution {
    public String largestGoodInteger(String num) {
        int largest = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            int hundred = num.charAt(i) - '0';
            int ten = num.charAt(i+1) - '0';
            int one = num.charAt(i+2) - '0';
            if (hundred == ten && ten == one && (hundred * 100 + ten * 10 + one) > largest) {
                largest = hundred * 100 + ten * 10 + one;
            }
        }
        if (largest == -1) {
            return "";
        } else if (largest == 0) {
            return "000";
        } else {
            return Integer.toString(largest);
        }
    }
}