// 18. 4Sum [Medium]
// https://leetcode.com/problems/4sum/
// Language: java | Runtime: 19 ms | Memory: 45.2 MB
// Time:  O(n^3)
// Space: O(1)
// Pattern: Sliding window + Hash set
// Synced: 2026-10-16

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set=new HashSet<>();
int n=nums.length;
Arrays.sort(nums);

List<List<Integer>> result=new ArrayList<>();
    for(int i=0;i<n-3;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
    for(int j=i+1;j<n-2;j++){
        if(j>i+1 && nums[j]==nums[j-1]){
            continue;
        }
        int l=j+1;
        int r=n-1;
     
    while(l<r){
     long sum=(long) nums[i]+nums[j]+nums[l]+nums[r];
        if(sum<target){
            l++;
        }else if(sum>target){
            r--;
        }else{
            result.add(List.of(nums[i],nums[j],nums[l],nums[r]));
            l++;
            r--;

            while(l<r && nums[l]==nums[l-1]) l++;

            while(l<r && nums[r]==nums[r+1]) r--;
        }
    }
    }
    }
return result;
    }
}