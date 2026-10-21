// 229. Majority Element II [Medium]
// https://leetcode.com/problems/majority-element-ii/
// Language: java | Runtime: 2 ms | Memory: 52.3 MB
// Time:  O(n) (auto-detected)
// Space: O(1)
// Synced: 2026-10-21

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0; int cand2=0; int cnt1=0, cnt2=0;

        for(int e:nums){
            if(e==cand1){
                cnt1++;
            }else if(e==cand2){
                cnt2++;
            }else if(cnt1==0){
                cand1=e;
                cnt1=1;
            }else if(cnt2==0){
                cand2=e;
                cnt2=1;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int e:nums){
            if(e==cand1) cnt1++;
            else if(e==cand2) cnt2++;

        }
            List<Integer> result=new ArrayList<>();
            
            if(cnt1>nums.length/3) result.add(cand1);
             if(cnt2>nums.length/3) result.add(cand2);

            return result;
    }
}