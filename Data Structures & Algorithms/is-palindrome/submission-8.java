class Solution {
    public boolean isPalindrome(String s) {
        String l = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(l.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(l.charAt(right))) {
                right--;
                continue;
            }
            if (l.charAt(left) == l.charAt(right)) {
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
