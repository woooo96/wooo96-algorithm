import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[Integer.parseInt(st.nextToken())];
        int cnt = Integer.parseInt(st.nextToken());

        for (int i = 0; i < array.length; i++) array[i]=i+1;

        for (int i = 0; i < cnt; i++) {
            int temp=0;
            st = new StringTokenizer(br.readLine());
            int sIdx = Integer.parseInt(st.nextToken())-1;
            int eIdx = Integer.parseInt(st.nextToken())-1;
            int[] sArray = new int[eIdx-sIdx+1];
            for (int j = eIdx, k=0; j >= sIdx; j--,k++) {
                sArray[k]=array[j];
            }
            for (int j = 0, k=sIdx; j < sArray.length; j++, k++) {
                array[k] = sArray[j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            bw.write(array[i]+" ");
        }
        bw.close();
    }
}
