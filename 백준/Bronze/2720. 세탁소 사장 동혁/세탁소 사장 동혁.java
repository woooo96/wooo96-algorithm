
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int[] array = new int[]{25, 10, 5, 1};
        for (int i = 0; i < cnt; i++) {
            int money = Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++) {
                bw.write(money/array[j]+" ");
                money%=array[j];
            }
            bw.write("\n");
        }
        bw.close();
    }
}