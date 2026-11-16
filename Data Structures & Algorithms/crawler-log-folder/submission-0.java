class Solution {
    public int minOperations(String[] logs) {
        int counter = 0;
        for (String s : logs) {
            if (s.equals("../")) {
                if (counter > 0) {
                    counter--;
                }
            } else if (s.equals("./")) {
                continue;
            } else {
                counter++;
            }
        }
        return counter;
    }
}