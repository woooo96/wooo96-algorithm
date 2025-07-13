import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int sqrtB = (int)Math.sqrt(B) + 1;  // B의 제곱근까지만 소수를 구하면 충분

        boolean[] isNotPrime = new boolean[sqrtB + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        // 에라토스테네스의 체
        for (int i = 2; i * i <= sqrtB; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= sqrtB; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int count = 0;

        // 구한 소수로 제곱 이상의 거의 소수 찾기
        for (int i = 2; i <= sqrtB; i++) {
            if (!isNotPrime[i]) {
                long num = (long)i * i;  // 소수의 제곱부터 시작
                while (num <= B) {
                    if (num >= A) {
                        count++;
                    }
                    if (num > Long.MAX_VALUE / i) break; // 오버플로 방지
                    num *= i;
                }
            }
        }

        System.out.println(count);
    }
}
