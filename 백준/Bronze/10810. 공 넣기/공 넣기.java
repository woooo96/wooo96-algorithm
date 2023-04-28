import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[Integer.parseInt(st.nextToken())];
        int cnt = Integer.parseInt(st.nextToken());
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int sIdx = Integer.parseInt(st.nextToken());
            int eIdx = Integer.parseInt(st.nextToken());
            int ballNum = Integer.parseInt(st.nextToken());
            for (int j = sIdx-1; j <= eIdx-1; j++) {
                array[j]=ballNum;
            }
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i]+" ");
        }
        bw.close();
    }
}
