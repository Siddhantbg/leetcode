// 15. 3Sum [Medium]
// https://leetcode.com/problems/3sum/
// Language: java | Runtime: 33 ms | Memory: 58.8 MB
// Space: O(n) (auto-detected)
// Pattern: Sliding window + Sorting
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-10-31

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
                    int l=0; int r=0;
            int sum=0;
    Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
                        l=i+1; r=n-1;

            if(i>0 && nums[i]==nums[i-1]) continue;
            while(l<r){

                sum=nums[i]+nums[l]+nums[r];

                if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }else{
                    res.add(List.of(nums[i],nums[l],nums[r]));
                    l++;
                    r--;

                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }
            }
        }
        return res;
    }
}