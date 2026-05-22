class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] letters = new int[26];
        Map<String, List<String>> anagrams = new HashMap<>();
        List<List<String>> groups = new ArrayList<>();
        for (String str : strs) {
            letters = new int[26];
            for (char letter : str.toCharArray()) {
                letters[letter - 'a']++;
            }
            if (!anagrams.containsKey(Arrays.toString(letters))) {
                anagrams.put(Arrays.toString(letters), new ArrayList<>());
            }
            anagrams.get(Arrays.toString(letters)).add(str);
        }
        System.out.println(anagrams.toString());
        for (String frequencies : anagrams.keySet()) {
            groups.add(anagrams.get(frequencies));
        }
        return groups;
    }
}
