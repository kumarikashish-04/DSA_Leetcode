class Solution {
    public long maxAlternatingSum(int[] nums) {
        // Array.sort(nums);
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0) nums[i]*=(-1);
        }
        Arrays.sort(nums);
        long x=0;
        for(int i=0;i<n/2;i++){
            x+=(nums[i]*nums[i]);
        }
        long y=0;
        for(int i=n/2;i<n;i++){
            y+=(nums[i]*nums[i]);

        }
        return y-x;
    }
}