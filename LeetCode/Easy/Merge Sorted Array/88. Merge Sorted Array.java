// 88. Merge Sorted Array [Easy]
// https://leetcode.com/problems/merge-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 43.2 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-10-30

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;

        int k=m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;i--;
            }else{
                nums1[k]=nums2[j];
                k--;j--;
            }
        }
    }
}