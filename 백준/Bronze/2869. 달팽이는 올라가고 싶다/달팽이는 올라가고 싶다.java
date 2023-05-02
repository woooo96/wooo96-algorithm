import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int answer = (total-down)%(up-down)==0 ? (total-down)/(up-down) : (total-down)/(up-down)+1;
        System.out.println(answer);
    }
}
