class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> um;
        vector<int>v(2);
        for(int i=0;i<nums.size();i++){
            int d=target-nums[i];
            if(um.find(d)!=um.end()){
                v[0]=um[d];
                v[1]=i;
                break;
            }
            um[nums[i]] = i;
        }
        return v;
    }
};