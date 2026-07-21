class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String original = "";
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            if ((97 <= s.charAt(i) && s.charAt(i) <= 122) ||
                (48 <= s.charAt(i) && s.charAt(i) <= 57)) {
                original = original + s.charAt(i);
            }
        }
        for (int i = original.length() - 1; i >= 0; i--) {
            rev = rev + original.charAt(i);
        }
        if (original.equals(rev)) {
            return true;
        }
        return false;
    }
}