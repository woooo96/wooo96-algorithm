import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        // 1자리 수는 소수만 시작할 수 있음: 2, 3, 5, 7
        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
    }

    // 현재 만들어진 숫자 num, 현재 자리수 len
    public static void dfs(int num, int len) {
        if (len == N) {
            System.out.println(num);
            return;
        }

        // 다음 자리수를 붙이기 (1~9)
        for (int i = 1; i <= 9; i++) {
            int next = num * 10 + i; // 새로운 숫자 생성
            if (isPrime(next)) {     // 소수일 경우에만 다음 단계로
                dfs(next, len + 1);
            }
        }
    }

    // 소수 판별
    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) { // √num까지만 검사
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
