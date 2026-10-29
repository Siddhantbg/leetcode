// 493. Reverse Pairs [Hard]
// https://leetcode.com/problems/reverse-pairs/
// Language: java | Runtime: 41 ms | Memory: 61 MB
// Time:  O(n logn)
// Space: O(1)
// Pattern: Binary search + Recursion
// Synced: 2026-10-30

class Solution {
    public int reversePairs(int[] nums) {
        int[] a=nums.clone();
        return sortCount(a,new int[a.length],0,a.length-1);        
    }

    private int sortCount(int[] a,int[]tmp,int lo,int hi){
        if(lo>=hi) return 0;

        int mid=lo+(hi-lo)/2;

        int count=sortCount(a,tmp,lo,mid);

        count+=sortCount(a,tmp,mid+1,hi);

        count+=countPairs(a,lo,mid,hi);

        merge(a,tmp,lo,mid,hi);
        return count;
    }

    private int countPairs(int[]a,int lo,int mid,int hi){
        int count=0,j=mid+1;

        for(int i=lo;i<=mid;i++){
            while(j<=hi && a[i]>2L*a[j]) j++;

            count+=j-(mid+1);
        }
        return count;
    }

    private void merge(int[] a,int[] tmp,int lo,int mid,int hi){
        int i=lo,j=mid+1,k=lo;
        
        while(i<=mid && j<=hi){
            if(a[i]<=a[j]){
                tmp[k]=a[i];
                k++;i++;
            }else{
                tmp[k]=a[j];
                k++;j++;
            }            
        }
        while(i<=mid){
            tmp[k]=a[i];
            k++;i++;
        }
        while(j<=hi){
            tmp[k]=a[j];
            k++;j++;
        }
        for(k=lo;k<=hi;k++){
            a[k]=tmp[k];
        }   

    }
}