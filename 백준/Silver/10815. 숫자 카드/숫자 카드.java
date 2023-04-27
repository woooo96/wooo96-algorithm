import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String answer="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < numCnt; i++) {
            int num = Integer.parseInt(st.nextToken());
            m.put(num, m.getOrDefault(num, 0));
        }
        numCnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numCnt; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (m.containsKey(num)) bw.write("1 ");
            else bw.write("0 ");
        }
        bw.close();
    }
}
