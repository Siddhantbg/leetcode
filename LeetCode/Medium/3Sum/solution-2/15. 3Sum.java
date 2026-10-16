// 15. 3Sum [Medium]
// https://leetcode.com/problems/3sum/
// Language: java | Runtime: 30 ms | Memory: 58.8 MB
// Space: O(n) (auto-detected)
// Pattern: Sliding window + Sorting
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-10-16

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int sum=0;
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            l=i+1;
            r=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(l<r){
                sum=nums[l]+nums[r]+nums[i];
                if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }else{
                     result.add(List.of(nums[i],nums[l],nums[r]));
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
                    return result;

    }
}