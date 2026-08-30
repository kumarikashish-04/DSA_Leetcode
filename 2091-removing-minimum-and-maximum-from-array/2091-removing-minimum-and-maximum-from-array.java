class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        int mi=0;
        int mni=0;
        for(int i=0;i<n;i++){
            if(nums[i]>mx){
                mx=nums[i];
                mi=i;
            }
            if(nums[i]<mn){
                mn=nums[i];
                mni=i;
            }
        }
        int x=Math.min(mi-0+1,n-mi);
        // System.out.println(x);
        int y=Math.min(mni-0+1,n-mni);
        // System.out.println(y);
        return Math.min(Math.max(n-mi,n-mni),Math.min(Math.max(mi+1,mni+1),x+y));
    }
}