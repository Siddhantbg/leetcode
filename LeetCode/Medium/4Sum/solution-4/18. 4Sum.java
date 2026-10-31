// 18. 4Sum [Medium]
// https://leetcode.com/problems/4sum/
// Language: java | Runtime: 17 ms | Memory: 45.2 MB
// Space: O(n) (auto-detected)
// Pattern: Sliding window + Sorting
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-10-31

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;

        List<List<Integer>> res=new ArrayList<>();
int l=0,r=0;
    Arrays.sort(nums);

        for(int i=0;i<n-3;i++){
            
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            for(int j=i+1;j<n-2;j++){
                 if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }

            l=j+1; r=n-1;

                while(l<r){
                    long sum= (long)nums[i]+nums[j]+nums[l]+nums[r];

                    if(sum<target){
                        l++;
                    }else if(sum>target){
                        r--;
                    }else{
                        res.add(List.of(nums[i],nums[j],nums[l],nums[r]));
                        
                        l++;r--;

                        while(l<r && nums[l]==nums[l-1]){
                            l++;
                        }
                        while(l<r && nums[r]==nums[r+1]){
                            r--;
                        }
                    }
                }

            }
        }
        return res;
    }
}