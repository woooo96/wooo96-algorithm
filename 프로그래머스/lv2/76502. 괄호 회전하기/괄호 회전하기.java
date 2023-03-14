import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> sStack = new Stack<>();
            Boolean check = true;
            for (int j = 0; j < s.length(); j++) {
                int index = j+i>=s.length() ? j+i-s.length() : j+i;
                if (sStack.size()==0 && ((s.charAt(index) == ')' || s.charAt(index) == '}' || s.charAt(index) == ']'))) {
                    check = false;
                    break;
                }
                if((sStack.size()>=1 && sStack.peek()=='(') && s.charAt(index)==')') {
                    sStack.pop();
                    continue;
                } else if ((sStack.size()>=1 && sStack.peek()=='[') && s.charAt(index)==']') {
                    sStack.pop();
                    continue;
                } else if ((sStack.size()>=1 && sStack.peek()=='{') && s.charAt(index)=='}') {
                    sStack.pop();
                    continue;
                }
                sStack.push(s.charAt(index));
            }

            if (sStack.size()==0 && check==true) answer++;
        }
        
        return answer;
    }
}