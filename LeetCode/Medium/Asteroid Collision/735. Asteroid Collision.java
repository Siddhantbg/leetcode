// 735. Asteroid Collision [Medium]
// https://leetcode.com/problems/asteroid-collision/
// Language: java | Runtime: 6 ms | Memory: 46.4 MB
// Space: O(n) (auto-detected)
// Pattern: Monotonic stack + Reverse traversal
// Tags: Array, Stack, Simulation
// Synced: 2026-11-22

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int ass:asteroids){
                    boolean alive=true;

            while(alive && !st.isEmpty() && st.peek()>0 && ass<0){
                if(st.peek()==-ass){
                    st.pop();
                    alive=false;
                }else if(st.peek()<-ass){
                    st.pop();
                }else{
                    alive=false;
                }
            }
            if(alive) st.push(ass);
        }

        int ans[]=new int[st.size()];

        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}