

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[30];
        int[] answer = new int[2];
        for (int i = 1; i <= 30; i++) array[i-1]++;
        for (int i = 0; i < 28; i++) array[Integer.parseInt(br.readLine())-1]=0;
        for (int i = 0, j=0; i < 30; i++) {
            if(array[i]==1) {
                answer[j]=i+1;
                j++;
            }
            if (j>2) break;
        }
        bw.write(answer[0]+"\n"+answer[1]);
        bw.close();

    }

}
