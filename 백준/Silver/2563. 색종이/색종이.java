import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] array = new int[101][101];
        int answer = 0;
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x+10; j++) {
                for (int k = y; k <y+10 ; k++) {
                    if(array[j][k] == 0) {
                        array[j][k]++;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
