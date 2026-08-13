class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int ex) {
        int mx=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i:nums){
            if(i>mx){
                mx=i;
            }
        }
        List<Boolean>lst=new ArrayList<>();
        for(int i:nums){
            if((i+ex)>=mx){
                lst.add(true);
            }
            else {
                lst.add(false);
            }
        }
        return lst;
    }
}