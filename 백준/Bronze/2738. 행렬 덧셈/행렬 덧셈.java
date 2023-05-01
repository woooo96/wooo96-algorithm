import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < array.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]+=Integer.parseInt(st.nextToken());
                bw.write(array[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
