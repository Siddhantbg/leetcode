// 75. Sort Colors [Medium]
// https://leetcode.com/problems/sort-colors/
// Language: java | Runtime: 0 ms | Memory: 43.1 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Two Pointers, Sorting, Quicksort, Bubble Sort
// Synced: 2026-10-31

class Solution {
    public void sortColors(int[] nums) {

        int l=0,mid=0,h=nums.length-1;

        while(mid<=h){
            if(nums[mid]==0){
                swap(nums,l,mid);
                mid++;
                l++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,h);
                h--;
            }
        }

    }
    private void swap(int nums[],int a,int b){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
}