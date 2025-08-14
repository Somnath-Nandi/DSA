#include<iostream>
#include<vector>
#include<set>
#include<algorithm>
using namespace std;

int main(){
    vector<int> nums = {-1,0,1,2,-1,-4};
    int target = 0;
    vector<vector<int>> result;
    int n = nums.size();
    set<vector<int>> s;
    
    for (int i = 0; i < n; i++){
        for(int j= i+1; j < n; j++){
            for(int k = j+1; k < n; k++){
                if(nums[i] + nums[j] + nums[k] == target){
                    vector<int> temp = {nums[i], nums[j], nums[k]};
                    sort(temp.begin(), temp.end());

                    if(s.find(temp) == s.end()){
                        s.insert(temp);
                        result.push_back(temp);
                    }
                }
            }
        }
    }
    for(int i = 0; i < result.size(); i++){
        for(int j = 0; j < result[i].size(); j++){
            cout << result[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}