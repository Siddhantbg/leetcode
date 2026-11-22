// 11. Container With Most Water [Medium]
// https://leetcode.com/problems/container-with-most-water/
// Language: java | Runtime: 5 ms | Memory: 76.8 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Array, Two Pointers, Greedy
// Synced: 2026-11-22

class Solution {
    public int maxArea(int[] height) {
     int l=0;
     int r=height.length-1;
     int maxArea=0;

     while(l!=r){
        int ans=Math.min(height[l],height[r]);
        int w=r-l;
        int area=w*ans;
        if(height[l]>height[r]){
            r--;
        }else{
            l++;
        }
        maxArea=Math.max(area,maxArea);
     }
return maxArea;
    }
}