class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return ;
        }
        int c=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
            }
            else{
                nums[k++]=nums[i];
            }
        }
        while(k<n&&c>=0){
            nums[k++]=0;
            c--;
        }
    }
}