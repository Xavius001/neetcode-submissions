class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0, right = heights.length - 1;
        while (left < right) {
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            max = Math.max(h*w, max);
            if (heights[left] > heights[right]) right--;
            else left++;
        }
        return max;
    }
}
