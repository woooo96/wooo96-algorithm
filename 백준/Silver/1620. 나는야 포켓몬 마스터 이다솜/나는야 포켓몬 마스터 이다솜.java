import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int quest = Integer.parseInt(st.nextToken());

        Map<String, String> m = new HashMap<>();
        Map<String, String> m2 = new HashMap<>();
        for (int i = 1; i <= cnt; i++) {
            String pocket = br.readLine();
            m.put(String.valueOf(i), pocket);
            m2.put(pocket, String.valueOf(i));
        }

        for (int i = 0; i < quest; i++) {
            String q = br.readLine();
            if(m.containsKey(q)) {
                bw.write(m.get(q)+"\n");
            } else {
                bw.write(m2.get(q)+"\n");
            }
        }
        bw.close();
    }
}
