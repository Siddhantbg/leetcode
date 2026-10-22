// 31. Next Permutation [Medium]
// https://leetcode.com/problems/next-permutation/
// Language: java | Runtime: 1 ms | Memory: 44.2 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Two pointers
// Tags: Array, Two Pointers
// Synced: 2026-10-22

class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;

        int i=n-2;

        while(i>=0 && nums[i]>=nums[i+1]) i--;
        
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }

    reverse(nums,i+1,n-1);
// i + 1 se reverse karte hain kyunki pivot index i tak ka part sahi hai, usko change nahi karna.
    }
    private void swap(int[]a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    private void reverse(int nums[],int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }    
    }
}