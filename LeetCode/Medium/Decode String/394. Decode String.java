// 394. Decode String [Medium]
// https://leetcode.com/problems/decode-string/
// Language: java | Runtime: 3 ms | Memory: 43 MB
// Time:  O(n + m)
// Space: O(n)
// Tags: String, Stack, Recursion
// Synced: 2026-06-29

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();
        
        String current="";
        int number=0;

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');
            }
            else if(ch=='['){
                countStack.push(number);
                stringStack.push(current); //for characters without no. repeats

                number=0;
                current="";
            }
            else if(ch==']'){
                int repeat=countStack.pop();
                String previous=stringStack.pop();

                StringBuilder temp=new StringBuilder(previous);
//ab3[c]
//Before encountering [:
//current = "ab";
                for(int i=0;i<repeat;i++){
                    temp.append(current);
                }
                current=temp.toString();
            }
            else{
                current+=ch;
            }
        }
        return current;
    }
}