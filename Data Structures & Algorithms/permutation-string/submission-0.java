class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] letters = new int[26];
        int windowLength = s1.length(), left = 0;
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)-'a']++;
        }
        for (int right = 0; right < s2.length(); right++) {
            letters[s2.charAt(right)-'a']--;
            if (right - left + 1 == windowLength) {
                if (checkPermutation(letters)) {
                    return true;
                }
                letters[s2.charAt(left++)-'a']++;
            }
        }
        return false;
    }
    public boolean checkPermutation(int[] letters) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
