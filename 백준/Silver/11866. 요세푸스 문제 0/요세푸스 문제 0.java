import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int yosepuse = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= num; i++) q.add(i);

        int i=1;
        while(q.size()!=0) {
            if(i%yosepuse==0) {
                if(num==1) bw.write("<"+q.poll()+">");
                else if(q.size()==num) bw.write("<"+q.poll()+", ");
                else if(q.size()==1) bw.write(q.poll()+">");
                else bw.write(q.poll()+", ");
                i=0;
            }
            else q.add(q.poll());
            i++;
        }
        bw.close();
    }
}
