class Solution {
    public void reverseString(char[] s) {
        char[] z = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            z[i] = s[s.length - 1 - i];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = z[i];
        }
    }
}