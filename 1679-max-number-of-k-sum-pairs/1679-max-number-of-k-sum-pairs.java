class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int c = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int comp = k - nums[i];

            if (mp.getOrDefault(comp, 0) > 0) {
                mp.put(comp, mp.get(comp) - 1);
                c++;
            } else {
                mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            }
        }
        return c;
    }
}