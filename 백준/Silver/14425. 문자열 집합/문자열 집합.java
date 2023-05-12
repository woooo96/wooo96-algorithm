import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        int arrCnt = Integer.parseInt(st.nextToken());
        int testCnt = Integer.parseInt(st.nextToken());

        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < arrCnt; i++) {
            String str = br.readLine();
            m.put(str, 0);
        }
        for (int i = 0; i < testCnt; i++) {
            String testStr = br.readLine();
            if (m.containsKey(testStr)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}