class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int content = 0;
        for (int i = g.length - 1; i >= 0; i--) {
            for (int j = s.length - 1; j >= 0; j--) {
                if (s[j] >= g[i] && s[j] != -1 && g[i] != -1) {
                    g[i] = -1;
                    s[j] = -1;
                    content++;
                }
            }
        }
        return content;
    }
}