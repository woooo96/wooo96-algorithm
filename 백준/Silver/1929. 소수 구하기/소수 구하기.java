import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 에라토스테네스의 체를 위한 배열
        boolean[] isNotPrime = new boolean[N + 1];

        // 0과 1은 소수가 아님
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        // 2부터 sqrt(N)까지의 수로 배수를 제거
        for (int i = 2; i * i <= N; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        // M부터 N까지의 소수를 출력
        for (int i = M; i <= N; i++) {
            if (!isNotPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
