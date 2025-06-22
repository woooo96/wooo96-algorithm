import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열 크기
        int k = sc.nextInt(); // k번째 수

        int left = 1;
        int right = k;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            // mid 이하의 값이 몇 개인지를 계산
            long count = 0;
            for (int i = 1; i <= N; i++) {
                count += Math.min(mid / i, N);
            }

            // k보다 크거나 같으면 더 작은 수를 찾아봄
            if (count >= k) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
