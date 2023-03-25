import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        Stack<Character> c = new Stack<>();
        if(s.charAt(0)>=97 && s.charAt(0)<=122) c.push((char) (s.charAt(0)-32));
        else c.push(s.charAt(0));
        answer+=c.peek();

        for (int i = 1; i < s.length(); i++) {
            if(c.peek()==' ' && s.charAt(i)>=97 && s.charAt(i)<=122) c.push((char) (s.charAt(i)-32));
            else c.push(s.charAt(i));
            answer+=c.peek();
        }

        return answer;
    }
}