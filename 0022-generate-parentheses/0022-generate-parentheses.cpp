class Solution {
public:
    void solve(int n,string &s,vector<string>&v,int i,int j){
        if(i==n&&j==i){
            v.push_back(s);
            return;
        }
        if(i>n||j>n||j>i) return;
        s+="(";
        solve(n,s,v,i+1,j);
        s.pop_back();
        s+=")";
        solve(n,s,v,i,j+1);
        s.pop_back();
    }
    vector<string> generateParenthesis(int n) {
        string s="";
        vector<string>v;
        solve(n,s,v,0,0);
        return v;
    }
};