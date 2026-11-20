// 347. Top K Frequent Elements [Medium]
// https://leetcode.com/problems/top-k-frequent-elements/
// Language: java | Runtime: 16 ms | Memory: 47 MB
// Time:  O(n log k)
// Space: O(n) (auto-detected)
// Pattern: Heap + Hash map
// Synced: 2026-11-20

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int e:nums){
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int key:map.keySet()){
            pq.offer(key);
            
            if(pq.size()>k){
                pq.poll();
            }
        }

        int res[]=new int[k];
        
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        return res;
    }   
}