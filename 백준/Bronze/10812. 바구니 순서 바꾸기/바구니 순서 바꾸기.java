import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        int[] array = new int[num];
        for (int i = 0; i < num; i++) array[i]=i+1;

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            Queue<Integer> q = new LinkedList<>();
            int num1=Integer.parseInt(st.nextToken())-1;
            int num2=Integer.parseInt(st.nextToken())-1;
            int num3=Integer.parseInt(st.nextToken())-1;
            for (int j = num1; j <= num2; j++) q.add(array[j]);
            for (int j = 0; j < num3-num1; j++) q.add(q.poll());
            for (int j = num1; j <= num2; j++) array[j]=q.poll();
        }
        String answer="";
        for (int i = 0; i < array.length; i++) {
            answer+=array[i]+" ";
        }
        System.out.println(answer);
    }
}
