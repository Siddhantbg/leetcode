// 56. Merge Intervals [Medium]
// https://leetcode.com/problems/merge-intervals/
// Language: java | Runtime: 9 ms | Memory: 48.7 MB
// Time:  O(n²) (auto-detected)
// Pattern: Sorting
// Tags: Array, Sorting, Quicksort
// Synced: 2026-11-21

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]>res=new ArrayList<>();
        int n=intervals.length;

        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];

            if(!res.isEmpty() && end<=res.get(res.size()-1)[1]){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }else{
                    break;
                }
            }
            res.add(new int[]{start,end});
        }
        return res.toArray(new int[res.size()][]);
    }
}