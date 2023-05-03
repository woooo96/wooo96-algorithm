import java.util.*;
class Solution {
public boolean solution(String s) {
        boolean answer=false;
        Stack<Character> st = new Stack<>();
        if(s.charAt(0)==')') return answer;
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty() || s.charAt(i)=='(') st.push(s.charAt(i));
            else st.pop();
        }
        answer = st.isEmpty() ? true : false;
        return answer;
    }
}