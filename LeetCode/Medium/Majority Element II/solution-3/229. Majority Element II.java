// 229. Majority Element II [Medium]
// https://leetcode.com/problems/majority-element-ii/
// Language: java | Runtime: 3 ms | Memory: 52.6 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Hash Table, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
// Synced: 2026-11-03

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int cnt1=0,cnt2=0;
        int cand1=0,cand2=0;

        for(int i=0;i<nums.length;i++){
            if(cand1==nums[i]){
                // cand1=nums[i];
                cnt1++;
            }else if(cand2==nums[i]){
                // cand2=nums[i];
                cnt2++;
            }else if(cnt1==0){
                cand1=nums[i];
                cnt1++;
            }else if(cnt2==0){
                cand2=nums[i];
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
cnt1=0;cnt2=0;

        for (int i=0;i<nums.length;i++){
                if(cand1==nums[i]){
                    cnt1++;
                }
                else if(cand2==nums[i]){
                    cnt2++;
                }
        }
List<Integer> res=new ArrayList<>();
        if(cnt1>nums.length/3) res.add(cand1);
       if(cnt2>nums.length/3) res.add(cand2);

        return res;
    }
}