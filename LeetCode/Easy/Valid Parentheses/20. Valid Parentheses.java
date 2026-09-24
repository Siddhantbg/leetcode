// 20. Valid Parentheses [Easy]
// https://leetcode.com/problems/valid-parentheses/
// Language: java | Runtime: 3 ms | Memory: 43.4 MB
// Tags: String, Stack, Bracket Sequences
// Synced: 2026-09-24

class Solution {
    public boolean isValid(String s) { //()
        Stack<Character> st=new Stack<>();

        boolean balanced=true; 

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                   return false;
                }  
            
            if(st.peek()=='('&& ch==')' || st.peek()=='{'&& ch=='}'||st.peek()=='['&& ch==']'){
                st.pop();
            }else{
                    return false;
            } 
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}