// 56. Merge Intervals [Medium]
// https://leetcode.com/problems/merge-intervals/
// Language: java | Runtime: 8 ms | Memory: 48.9 MB
// Time:  O(n log n) (auto-detected)
// Pattern: Sorting
// Tags: Array, Sorting, Quicksort
// Synced: 2026-11-21

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]> res=new ArrayList<>();

        for(int[] cur:intervals){
            if(res.isEmpty()|| cur[0]>res.get(res.size()-1)[1]){
                res.add(cur);
            }else{
                int[] last=res.get(res.size()-1);
                last[1]=Math.max(last[1],cur[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}