import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int quNum = Integer.parseInt(st.nextToken());

        long[] s = new long[num];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            s[i] = i==0 ? Integer.parseInt(st.nextToken()) : s[i-1]+Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < quNum; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken())-2;
            int num2 = Integer.parseInt(st.nextToken())-1;
            if (num1<0) {
                System.out.println(s[num2]);
            } else {
                System.out.println(s[num2]-s[num1]);
            }
        }

    }
}
