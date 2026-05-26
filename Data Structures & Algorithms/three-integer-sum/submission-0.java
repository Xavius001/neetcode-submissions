class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0 ; i < n - 2; i++) {
            int j = i+1, k = n - 1;
            while (j < k) {
                if (nums[j] + nums[k] > -nums[i]) {
                    k--;
                }
                else if (nums[j] + nums[k] < -nums[i]) {
                    j++;
                }
                else {
                    if (!sums.contains(List.of(nums[i], nums[j], nums[k]))) {
                        sums.add(List.of(nums[i], nums[j], nums[k]));
                    }
                    j++;
                    k--;
                }
            }
        }
        return sums;
    }
}
