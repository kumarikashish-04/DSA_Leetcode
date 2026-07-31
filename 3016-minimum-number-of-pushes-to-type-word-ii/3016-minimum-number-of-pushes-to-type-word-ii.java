class Solution {
    public int minimumPushes(String word) {
        int []freq=new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int cnt=0;
        int roll=1;
        int s=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0)break;
            s=s+(freq[i]*roll);
            cnt++;
            if(cnt==8){
                roll++;
                cnt=0;
            }
        }
        return s;
    }
}