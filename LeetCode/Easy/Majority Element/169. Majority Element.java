// 169. Majority Element [Easy]
// https://leetcode.com/problems/majority-element/
// Language: java | Runtime: 2 ms | Memory: 63.3 MB
// Tags: Array, Hash Table, Divide and Conquer, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
// Synced: 2026-09-29

class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int c=0;

        for(int num:nums){
            if(c==0){
                candidate=num;
            }        
            if(num==candidate){
                c++;
            }else{
                c--;
            }
}
return candidate;
    }
}

// Boyer-Moore Voting Algorithm
// Since the majority element appears more than n/2 times, we can cancel out every different pair.