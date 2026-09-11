// 1047. Remove All Adjacent Duplicates In String [Easy]
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// Language: java | Runtime: 36 ms | Memory: 46.9 MB
// Tags: String, Stack
// Synced: 2026-09-11

class Solution {

    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(!st.isEmpty() && st.peek() == ch) {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}