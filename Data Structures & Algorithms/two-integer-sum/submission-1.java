class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] pair = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                pair[1] = i;
                pair[0] = map.get(diff);
                break;
            }
            else {
                map.put(nums[i], i);
            }
        }

        return pair;
    }
}
