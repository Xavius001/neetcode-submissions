class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> chars = new HashSet<>();
        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }
        
        int maxWindowLength = 0;
        for (char ch: chars) {
            int left = 0;
            int charFrequency = 0;
            for(int right = 0; right < s.length(); right++) {
                if(ch == s.charAt(right)) {
                    charFrequency++;
                }
                while ((right - left + 1) - charFrequency > k) {
                    if(ch == s.charAt(left)) {
                        charFrequency--;
                    }
                    left++;
                }
                maxWindowLength = Math.max(right-left+1,maxWindowLength);
            }
        }
        return maxWindowLength;
    }
}
