import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int w = Integer.MIN_VALUE;
        int h = Integer.MIN_VALUE;

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            x = Math.min(x, A);
            y = Math.min(y, B);
            w = Math.max(w, A);
            h = Math.max(h, B);
        }
        System.out.println((w-x)*(h-y));
    }
}
