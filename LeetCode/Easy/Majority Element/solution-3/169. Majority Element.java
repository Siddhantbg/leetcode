// 169. Majority Element [Easy]
// https://leetcode.com/problems/majority-element/
// Language: java | Runtime: 2 ms | Memory: 62.7 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Array, Hash Table, Divide and Conquer, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
// Synced: 2026-10-31

class Solution {
    public int majorityElement(int[] nums) {
        int count=0; int candidate=0;

        for(int e:nums){
            if(count==0){
                candidate=e;
                count++;
            }else if(candidate==e){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}