// 18. 4Sum [Medium]
// https://leetcode.com/problems/4sum/
// Language: java | Runtime: 19 ms | Memory: 45.3 MB
// Space: O(n) (auto-detected)
// Pattern: Sliding window + Sorting
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-10-30

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
List<List<Integer>> map=new ArrayList<>();
Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                 if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
                    int l=j+1; int r=nums.length-1;

            while(l<r){
                long sum=(long) nums[i]+nums[j]+nums[l]+nums[r];

                if(sum<target){
                    l++;
                }else if(sum>target){
                    r--;
                }else{
                    map.add(List.of(nums[i],nums[j],nums[l],nums[r]));
                    l++;
                    r--;

                        while(l<r && nums[l]==nums[l-1]) l++;

                        while(l<r && nums[r]==nums[r+1]) r--;
                }
            }   

            }
        }
        return map;
    }
}