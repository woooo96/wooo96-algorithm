import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer=0;
        int index = st.countTokens();
        for (int i = 0; i < index; i++) {
            if(Integer.parseInt(st.nextToken())==num) answer++;
        }
        System.out.println(answer);

    }
}