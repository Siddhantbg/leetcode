// 15. 3Sum [Medium]
// https://leetcode.com/problems/3sum/
// Language: java | Runtime: 35 ms | Memory: 58.8 MB
// Space: O(n) (auto-detected)
// Pattern: Sliding window + Sorting
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-11-19

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
           if(i>0 && nums[i]==nums[i-1]){
            continue;
           }
        
            int l=i+1;
            int r=n-1;
int sum=0;
            while(l<r){
                sum=nums[i]+nums[l]+nums[r];

                if(sum==0){
                    res.add(List.of(nums[i],nums[l],nums[r]));
                    l++;
                    r--;

//compare prev (old) values, not the next one
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }

            }
        }
return res;
    }
}