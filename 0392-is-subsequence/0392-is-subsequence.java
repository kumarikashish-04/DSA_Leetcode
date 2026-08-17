class Solution {
    public boolean isSubsequence(String s, String t) {
        int x=s.length();
        int y=t.length();
        if(x>y)return false;
        int i=0;
        int j=0;
        while(j<y&&i<x){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==x?true:false;
    }
}