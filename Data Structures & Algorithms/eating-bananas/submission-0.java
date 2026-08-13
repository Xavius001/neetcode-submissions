class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int r = piles[piles.length-1];
        int l = 1;
        int minSpeed = r;
        while (l <= r) {
            int k = l + (r - l) / 2;
            int time = 0;
            for (int i = 0; i < piles.length; i++) {
                time += Math.ceil( (double) piles[i] / k);
            }
            if (time <= h) {
                minSpeed = Math.min(minSpeed, k);
                r = k - 1;
            }
            else {
                l = k + 1;
            }
        }
        return minSpeed;
    }
}
