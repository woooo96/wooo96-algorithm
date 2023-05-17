import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int test1 = num1;
            int test2 = num2;
            int k=2, l=2;
            while(test1!=test2) {
                if (test1 < test2) {
                    test1 = num1*k;
                    k++;
                } else {
                    test2 = num2*l;
                    l++;
                }
            }
            bw.write(test1+"\n");
        }
        bw.close();
    }
}