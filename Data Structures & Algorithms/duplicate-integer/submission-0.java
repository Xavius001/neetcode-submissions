class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, map.getOrDefault(num,0)+1);
            }
            else {
                return true;
            }
        }
        return false;
    }
}