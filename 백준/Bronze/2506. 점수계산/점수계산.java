//10
//1 0 1 1 1 0 0 1 1 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num=0;
        int sum=0;
        for (int i = 0; i < cnt; i++) {
            if(Integer.parseInt(st.nextToken())==1) {
                sum+=++num;
            } else {
                num=0;
            }
        }
        System.out.println(sum);
    }
}
