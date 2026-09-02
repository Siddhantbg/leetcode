// 189. Rotate Array [Medium]
// https://leetcode.com/problems/rotate-array/
// Language: java | Runtime: 4 ms | Memory: 268.5 MB
// Time:  O(n)
// Space: O(n)
// Tags: Array, Math, Two Pointers
// Synced: 2026-09-03

class Solution {

// k=k%n 
//10%7 =3
// so result 10 or 3 will be the same , unnecessary operations bach jaate hai
//O(N), O(1)
//reverse algo
public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);// 123->321 //k=2
        reverse(nums,0,k-1);//321->231    k-1 coz array 0 se start  hota hai bhai
        reverse(nums,k,nums.length-1);//231
}
  public void reverse(int[] nums, int l, int r) {
        while (l < r) {

            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
    }
}