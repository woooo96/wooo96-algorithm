import java.io.*;

public class Main{
        public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            String[] arr =  s.split(" ");
            bw.write(Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+"\n");
        }
        bw.close();
    }
}