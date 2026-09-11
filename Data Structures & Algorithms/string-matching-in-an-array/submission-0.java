class Solution {
    public List<String> stringMatching(String[] words) {
        boolean[] isContained = new boolean[words.length];
        for (int i = 0; i < isContained.length; i++) {
            isContained[i] = false;
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].contains(words[j]) && i != j) {
                    isContained[j] = true;
                }
            }
        }
        List<String> s = new ArrayList<String>();
        for (int i = 0; i < isContained.length; i++) {
            if (isContained[i]) {
                s.add(words[i]);
            }
        }
        return s;
    }
}