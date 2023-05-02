import java.io.*;
import java.util.StringTokenizer;

//60466175 36
//ZZZZZ
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int base = Integer.parseInt(st.nextToken());

        String answer = "";
        for (int i = num; i > 0; i/=base) {
            if(i%base >= 10) {
                answer=(char)(i%base+55)+answer;
            } else {
                answer=(i%base)+answer;
            }
        }

        System.out.println(answer);

    }
}
