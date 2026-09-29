// 1299. Replace Elements with Greatest Element on Right Side [Easy]
// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
// Language: java | Runtime: 3 ms | Memory: 49.2 MB
// Tags: Array
// Synced: 2026-09-29

class Solution {
    public int[] replaceElements(int[] nums) {
        int maxRight=-1;

        for(int i=nums.length-1;i>=0;i--){
            int current=nums[i];

            nums[i]=maxRight;

            maxRight=Math.max(maxRight,current);
        }
        return nums;
    }
}
// A leader is an element such that every element to its right is smaller than it.

// ArrayList<Integer> ans=new ArrayList<>();
//         int maxRight=nums[nums.length-1];
// ans.add(maxRight);
//         for(int i=nums.length-2;i>=0;i--){
//             if(nums[i]>=maxRight){
//                 ans.add(nums[i]);
//                 maxRight=nums[i];
//             }
//         }
//                 Collections.reverse(ans);

// return ans;