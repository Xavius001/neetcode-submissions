class Solution {
    public boolean isAnagram(String s, String t) {
        int alphabetSize = 26;
        int[] sLetters = new int[alphabetSize];
        int[] tLetters = new int[alphabetSize];
        
        for (char letter : s.toCharArray()) {
            sLetters[letter - 'a']++;
        }

        for (char letter : t.toCharArray()) {
            tLetters[letter - 'a']++;
        }

        for (int i = 0; i < alphabetSize; i++) {
            if (sLetters[i] != tLetters[i]) return false;
        }

        return true;
    }
}
