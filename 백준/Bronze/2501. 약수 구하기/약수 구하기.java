import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());
        int idx2 = 0;
        int answer = 0;

        if (num==1 && idx==1) {
            System.out.println("1");
            return;
        }
        for (int i = 1; i<=num; i++) {
            if(num%i==0) {
                idx2++;
            }
            if (idx2 == idx) {
                answer=i;
                break;
            }
        }
        if (idx2 != idx) {
            System.out.println("0");
        } else {
            System.out.println(answer);
        }
    }
}
