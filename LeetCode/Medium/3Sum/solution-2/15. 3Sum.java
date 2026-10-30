// 15. 3Sum [Medium]
// https://leetcode.com/problems/3sum/
// Language: java | Runtime: 32 ms | Memory: 58.6 MB
// Space: O(n) (auto-detected)
// Pattern: Sliding window + Sorting
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-10-30

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     int l=0;
     int r=0;
     int sum=0;
    List<List<Integer>> map=new ArrayList<>();
Arrays.sort(nums);
     for(int i=0;i<nums.length-2;i++){
        l=i+1;
        r=nums.length-1;

        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
    
        while(l<r){
            sum=nums[i]+nums[l]+nums[r];
            
            if(sum<0){
                l++;
            }else if(sum>0){
                r--;
            }else{
                map.add(List.of(nums[i],nums[l],nums[r]));
                l++;
                r--;

                while(l<r && nums[l]==nums[l-1]) l++;

                while(l<r && nums[r]==nums[r+1]) r--;               
            }
        }
        
     } 
     return map;  
    }
}