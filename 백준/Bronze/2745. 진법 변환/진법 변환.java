import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int arithmetic = Integer.parseInt(st.nextToken());
        int answer = 0;
        for (int i = str.length()-1,j=1; i >= 0; i--) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
                if(j==1) answer+=(str.charAt(i)-55);
                else answer+=(str.charAt(i)-55)*j;
            } else answer+=Integer.parseInt(String.valueOf(str.charAt(i)))*j;
            j*=arithmetic;
        }
        System.out.println(answer);
    }
}
