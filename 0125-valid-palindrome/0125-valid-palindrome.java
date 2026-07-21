class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder original = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((97 <= s.charAt(i) && s.charAt(i) <= 122) ||
                (48 <= s.charAt(i) && s.charAt(i) <= 57)) {
                original.append(s.charAt(i));
            }
        }
        for (int i = original.length() - 1; i >= 0; i--) {
            rev.append(original.charAt(i));
        }
        return original.toString().equals(rev.toString());
    }
}