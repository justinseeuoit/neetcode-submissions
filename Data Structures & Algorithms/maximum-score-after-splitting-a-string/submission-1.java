class Solution {
    public int maxScore(String s) {
        char[] c = s.toCharArray();
        int maxScore = 0;
        for (int i = 1; i < c.length; i++) {
            int score = 0;
            for (int j = 0; j < i; j++) {
                if (c[j] == '0') {
                    score++;
                }
            }
            for (int j = i; j < c.length; j++) {
                if (c[j] == '1') {
                    score++;
                }
            }
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }
}