// 1299. Replace Elements with Greatest Element on Right Side [Easy]
// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
// Language: java | Runtime: 3 ms | Memory: 48.7 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Reverse traversal
// Tags: Array
// Synced: 2026-10-22

class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxRight=arr[n-1];

        int curr=0;
        for(int i=n-2;i>=0;i--){
            curr=arr[i];//1 6 4 5 18 17
            arr[i]=maxRight;//-1 1 6 6 6 18 (array is being updated from the right side coz of the loop)
            maxRight=Math.max(maxRight,curr);//(-1,1)=1 (1,6)=6 (6,4)=6 (6,5)=6 (18,6)=18   (17,18)=18
         }

         arr[n-1]=-1;
        return arr;
    }
}