// 78. Subsets [Medium]
// https://leetcode.com/problems/subsets/
// Language: java | Runtime: 1 ms | Memory: 43.5 MB
// Time:  O(2^n*n)
// Space: O(n)
// Pattern: Recursion
// Synced: 2026-11-22
//
// including input and output sc will be O(2^n*n)

class Solution {

    void solve(int i,int[]nums,List<Integer>temp,List<List<Integer>> ans){
            
            if(i==nums.length){
                ans.add(new ArrayList<>(temp));
                return;
            }
            // Kyunki `ArrayList` ka `add(x)` ka rule hi yahi hai: bina index diye `add` karo toh element hamesha **list ke end** mein jaata hai.
            temp.add(nums[i]);
            solve(i+1,nums,temp,ans);

            temp.remove(temp.size()-1);
            solve(i+1,nums,temp,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}