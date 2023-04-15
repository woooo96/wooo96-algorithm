import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int answer=0;
        for (int i = 0; i < cnt; i++) {
            String word = s.next();
            Stack<Character> st = new Stack<>();
            st.push(word.charAt(0));
            for (int j = 1; j < word.length(); j++) {
                if(st.size()!=0 && word.charAt(j)==st.peek()) st.pop();
                else st.push(word.charAt(j));
            }
            if(st.size()==0) answer++;
        }
        System.out.println(answer);
    }
}
