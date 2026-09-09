class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        while (i < sc.length && j < tc.length) {
            if (sc[i] == tc[j]) {
                i++;
            }
            j++;
        }
        return i == sc.length;
    }
}