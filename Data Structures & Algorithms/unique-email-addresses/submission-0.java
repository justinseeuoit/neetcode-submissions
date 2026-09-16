class Solution {
    public int numUniqueEmails(String[] emails) {
        for (int i = 0; i < emails.length; i++) {
            String[] parts = emails[i].split("@");
            parts[0] = parts[0].replace(".", "");
            parts[0] = parts[0].replaceAll("\\+.*", "");
            emails[i] = parts[0] + "@" + parts[1];
        }
        LinkedHashSet<String> s = new LinkedHashSet<String>();

        for (int i = 0; i < emails.length; i++)
            s.add(emails[i]);

        return s.size();
    }
}