// 75. Sort Colors [Medium]
// https://leetcode.com/problems/sort-colors/
// Language: java | Runtime: 0 ms | Memory: 43 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Two Pointers, Sorting, Quicksort, Bubble Sort
// Synced: 2026-10-17

class Solution {
    public void sortColors(int[] nums) {
        int l=0; int h=nums.length-1; int mid=0;

        while(mid<=h){
            if(nums[mid]==0){
                swap(nums,l,mid);
                l++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,h);
                h--;
//                 When we swap nums[mid] == 2 with nums[h], the element coming from h could be 0, 1, or 2.
// If we do mid++, we skip checking that element, which can lead to an incorrect sort. So, we only do h-- and recheck mid.
            }
        }
    }
    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}