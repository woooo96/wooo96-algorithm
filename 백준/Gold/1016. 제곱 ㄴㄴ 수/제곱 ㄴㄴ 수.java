import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        int size = (int)(max - min + 1);
        boolean[] isNotSquareFree = new boolean[size]; // 제곱으로 나누어지는 수는 true

        // 2부터 sqrt(max) 까지 모든 제곱수로 마킹
        for (long i = 2; i * i <= max; i++) {
            long pow = i * i;

            // min 이상에서 시작되는 pow의 배수를 찾기
            long start = min / pow;
            if (min % pow != 0) {
                start++;
            }

            for (long j = start; j * pow <= max; j++) {
                int index = (int)((j * pow) - min);
                isNotSquareFree[index] = true;
            }
        }

        // 제곱ㄴㄴ수의 개수 세기
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (!isNotSquareFree[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
