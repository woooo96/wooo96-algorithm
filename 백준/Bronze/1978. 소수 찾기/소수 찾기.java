import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean check = true;
            if(num==1) continue;
            for (int j = 1; j <= Math.sqrt(num); j++) {
                if (num%j==0 && j!=1) {
                    check=false;
                    break;
                }
            }
            if (check) answer++;
        }
        System.out.println(answer);
    }
}
