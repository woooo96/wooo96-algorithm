import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int answer = 0;
        for (int i = 0; i < cnt; i++) {
            Stack<Character> st = new Stack<>();
            Map<Character, Integer> m = new HashMap<>();
            String str = s.next();
            boolean checker = false;
            st.push(str.charAt(0));
            //그룹 단어 -> 낱개 단어로 중복을 제거해서 스택에 저장
            for (int j = 1; j < str.length(); j++) {
                if(st.peek()==str.charAt(j)) st.push(st.pop());
                else st.push(str.charAt(j));
            }
            int index = st.size();
            //map 자료구조에 스택에 있는 단어 하나씩을 저장하는데, 해당 단어가 이미 저장되어 있을 경우 조건에 맞지 않기 때문에 break 후 다음으로 넘어감 
            for (int j = 0; j < index; j++) {
                char word=st.pop();
                if(m.containsKey(word)) {
                    checker=true;
                    break;
                } else {
                    m.put(word, m.getOrDefault(word, 0)+1);
                }
            }
            if(checker==false) answer++;
        }
        System.out.println(answer);
    }
}
