import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int num = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
//        String answer="";
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < cnt; i++) {
            int nextNum = s.nextInt();
            while(st.peek()<nextNum) {
//                answer+="+\n";
                bf.append("+\n");
                num++;
                st.push(num);
            }
            if(st.peek()==nextNum) {
                st.pop();
                bf.append("-\n");
//                answer+="-\n";
            } else {
//                answer="NO";
                System.out.println("NO");
                return;
            }
        }
        System.out.println(bf);
//        System.out.println(answer);
    }
}
