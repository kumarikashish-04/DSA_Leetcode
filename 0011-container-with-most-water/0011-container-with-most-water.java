class Solution {
    public int maxArea(int[] ht) {
        int n=ht.length;
        int i=0;
        int j=n-1;
        int ma=Integer.MIN_VALUE;
        while(i<j){
            int a=Math.min(ht[i],ht[j])*(j-i);
            ma=Math.max(a,ma);
            if(ht[i]<ht[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return ma;
    }
}