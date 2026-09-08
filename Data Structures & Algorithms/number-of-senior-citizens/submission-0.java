class Solution {
    public int countSeniors(String[] details) {
        int total = 0;
        for (String detail : details) {
            String s = detail.substring(11, 13);
            int n = Integer.parseInt(s);
            if (n > 60) {
                total++;
            }
        }
        return total;
    }
}