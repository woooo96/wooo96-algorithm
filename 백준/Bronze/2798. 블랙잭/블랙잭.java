import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[cnt];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) arr[i] = Integer.parseInt(st.nextToken());
        int max = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum <= num && sum>max) max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
