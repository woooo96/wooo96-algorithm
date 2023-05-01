import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                bw.write(String.valueOf(str.charAt(j)).repeat(repeat));
            }
            bw.write("\n");
        }
        bw.close();
    }
}