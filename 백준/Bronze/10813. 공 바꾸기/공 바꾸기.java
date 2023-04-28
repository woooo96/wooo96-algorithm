import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[Integer.parseInt(st.nextToken())];
        int cnt = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= array.length; i++) array[i-1]=i;

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int temp=0;
            int num1=Integer.parseInt(st.nextToken())-1;
            int num2=Integer.parseInt(st.nextToken())-1;
            temp=array[num1];
            array[num1] = array[num2];
            array[num2] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i]+" ");
        }
        bw.close();

    }
}
