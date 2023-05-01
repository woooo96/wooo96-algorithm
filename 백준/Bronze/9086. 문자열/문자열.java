import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = s.nextInt();
        for (int i = 0; i < cnt; i++) {
            String str = s.next();
            bw.write(str.charAt(0)+""+str.charAt(str.length()-1)+"\n");
        }
        bw.close();
    }
}