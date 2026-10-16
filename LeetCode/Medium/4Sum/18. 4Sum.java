// 18. 4Sum [Medium]
// https://leetcode.com/problems/4sum/
// Language: java | Runtime: 507 ms | Memory: 46.9 MB
// Time:  O(n³) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Hash set + Sorting
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-10-16

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set=new HashSet<>();
int n=nums.length;
Arrays.sort(nums);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> seen=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long fourth=(long) target-nums[i]-nums[j]-nums[k];
                    List<Integer> quad=new ArrayList<>();
                    if(seen.contains(fourth)){
                       quad=List.of(nums[i],nums[j],nums[k],(int) fourth);
                       set.add(quad);
                    }
                    seen.add((long) nums[k]);
                }
            }
        }
                return new ArrayList<>(set);
 
    }
}