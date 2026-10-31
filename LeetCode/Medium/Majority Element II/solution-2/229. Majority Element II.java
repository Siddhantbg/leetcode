// 229. Majority Element II [Medium]
// https://leetcode.com/problems/majority-element-ii/
// Language: java | Runtime: 2 ms | Memory: 52 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Hash Table, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
// Synced: 2026-10-31

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0,cand2=0,cnt1=0,cnt2=0;
        
        for(int e:nums){
            if(cand1==e){
                cnt1++;
            }else if(cand2==e){
                cnt2++;
            }else if(cnt1==0){
                cand1=e;
                cnt1++;
            }else if(cnt2==0){
                cand2=e;
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
cnt1=0; cnt2=0;
        for(int e:nums){
            if(e==cand1)cnt1++;
            else if(e==cand2)cnt2++;
        }

        List<Integer> res=new ArrayList<>();

        if(cnt1>nums.length/3) res.add(cand1);
        if(cnt2>nums.length/3) res.add(cand2);

        return res;
    }
}