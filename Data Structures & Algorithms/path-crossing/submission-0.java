class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;

        Set<String> visit = new HashSet<>();
        visit.add(x + ", " + y);
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
            String position = x + ", " + y;
            
            if (visit.contains(position)) return true;
            visit.add(x + ", " + y);
        }
        
        return false;
    }
}