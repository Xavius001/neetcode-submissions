class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int l = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r),0)+1);
            while ( freq.get(s.charAt(r)) > 1) {
                freq.put(s.charAt(l), freq.get(s.charAt(l))-1);
                l++;
            }
            max = Math.max(r-l+1,max);
        }
        return max;
    }
}
