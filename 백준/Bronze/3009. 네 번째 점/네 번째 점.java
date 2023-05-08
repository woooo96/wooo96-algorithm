import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[3][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        int x = array[1][0] == array[0][0] ? array[2][0] : (array[1][0] == array[2][0] ? array[0][0] : array[1][0]);
        int y = array[1][1] == array[0][1] ? array[2][1] : (array[1][1] == array[2][1] ? array[0][1] : array[1][1]);
        System.out.println(x + " " + y);
    }
}
