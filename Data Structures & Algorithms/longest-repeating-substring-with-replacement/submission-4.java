class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int l = 0;
        int maxWindow = 0;
        int maxFreq = 0; // Tracks the count of the most frequent character in the current window

        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            
            // 1. Always update the frequency of the character entering the window from the right
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);
            
            // 2. Update the max frequency seen in the current window
            maxFreq = Math.max(maxFreq, freq.get(rightChar));

            // 3. If total characters minus the dominant character's count exceeds k, shrink from the left
            // Current window size is (r - l + 1)
            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                freq.put(leftChar, freq.get(leftChar) - 1);
                l++; // Move the left pointer forward
            }

            // 4. Track the maximum valid window size found
            maxWindow = Math.max(maxWindow, r - l + 1);
        }

        return maxWindow;
    }
}
