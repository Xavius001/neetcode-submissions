class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Set<Integer> unique = new HashSet<>();
        int prev = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                unique.add(nums[i]);
                prev = nums[i];
            }
            else if (nums[i] == prev) {
                continue;
            }
            else if (nums[i] - prev == 1) {
                unique.add(nums[i]);
                prev = nums[i];
            }
            else {
                unique = new HashSet<>();
                unique.add(nums[i]);
                prev = nums[i];
            }
            max  = Math.max(unique.size(),max);
        }
        return max;
    }
}
