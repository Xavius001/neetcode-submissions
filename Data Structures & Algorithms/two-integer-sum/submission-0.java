class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        Map<Integer, Integer> diff = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (diff.containsKey(nums[i])) {
                pair[0] = diff.get(nums[i]);
                pair[1] = i;
                break;
            }
            else if (!diff.containsKey(difference)) {
                diff.put(difference, i);
            }
        }
        return pair;
    }
}
