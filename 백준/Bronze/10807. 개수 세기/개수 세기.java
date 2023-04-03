import java.io.*;

public class Main{
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr =  s.split(" ");
        String eq = br.readLine();
        int answer =0;
        for (int j = 0; j < i; j++) {
            if(arr[j].equals(eq)) answer++;
        }
        System.out.println(answer);
    }
}