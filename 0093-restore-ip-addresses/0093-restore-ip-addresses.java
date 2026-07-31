class Solution {
    List<String> lst = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backtrack(0, s,new ArrayList<>());
        return lst;
    }

    void backtrack(int idx, String s, List<String> ans) {
        if (ans.size() == 4) {
            if (idx == s.length() ) {
                lst.add(String.join(".", ans));
            }
            return;
        }
        for (int l = 1; l <= 3 && l + idx <= s.length(); l++) {
            String temp = s.substring(idx, idx + l);
            if (valid(temp)) {
                ans.add(temp);
                backtrack(l + idx, s, ans);
                ans.remove(ans.size() - 1);
            }
        }
    }
    boolean valid(String s){
        if(s.length()>1&&s.charAt(0)=='0'){
            return false;
        }
        int t=Integer.parseInt(s);
        return t>=0&&t<=255;
    }

}