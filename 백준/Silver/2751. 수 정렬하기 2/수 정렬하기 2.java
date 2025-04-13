import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 배열 생성 및 입력
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(arr);

        // 출력 처리 (빠르게 출력하기 위해 StringBuilder 사용)
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append('\n');
        }

        // 결과 출력
        System.out.print(sb);
    }
}
