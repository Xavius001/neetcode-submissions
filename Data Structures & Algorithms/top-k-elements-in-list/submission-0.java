class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] mostFrequent = new int[k];
        Map<Integer, Integer> frequencies = new HashMap<>();
        List<int[]> frequencyList = new ArrayList<>();
        
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num,0)+1);
        }
        
        for (int num : frequencies.keySet()) {
            frequencyList.add(new int[]{num, frequencies.get(num)});
        }
        
        frequencyList.sort((a, b) -> b[1]-a[1]);
        for (int i = 0; i < k; i++) {
            mostFrequent[i] = frequencyList.get(i)[0];
        }
        return mostFrequent;
    }
}
