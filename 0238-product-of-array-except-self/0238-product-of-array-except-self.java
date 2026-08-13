class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c=0;
        int p=1;
        int idx=-1;
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                idx=i;
                c++;
                continue;
            }
            else p*=nums[i];
        }
        if(c>1) return arr;
        if(c==1){
            arr[idx]=p;
            return arr;
        }
        for(int i=0;i<n;i++){
            arr[i]=p/nums[i];
        }
        return arr;
    }
}