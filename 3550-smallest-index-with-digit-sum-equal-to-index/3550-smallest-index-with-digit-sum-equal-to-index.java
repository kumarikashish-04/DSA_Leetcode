class Solution {
    int sum(int n){
        int s=0;
        while(n!=0){
            s+=(n%10);
            n=n/10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=sum(nums[i]);
            if(i==x){
                return i;
            }
        }
        return -1;
    }
}