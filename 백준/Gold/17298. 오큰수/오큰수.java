import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[cnt];
        int[] answer = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i]=Integer.parseInt(st.nextToken());
        }
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for (int i = 1; i < cnt; i++) {
            while(!s.isEmpty() && array[s.peek()] < array[i]){
                answer[s.pop()] = array[i];
            }
            s.push(i);
        }
        while(!s.empty()) {
            answer[s.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < cnt; i++) {
            bw.write(answer[i] + " ");
        }
        bw.flush();

    }
}