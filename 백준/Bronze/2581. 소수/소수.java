import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        List<Integer> l = new ArrayList<>();
        int sum=0;

        for (int i = A; i <= B; i++) {
            boolean check = true;
            if(i==1) continue;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i%j==0 && j!=1) {
                    check=false;
                    break;
                }
            }
            if(check) {
                if(!l.contains(i)){
                    l.add(i);
                    sum+=i;
                }
            }
        }
        if(l.isEmpty()) bw.write(-1+"");
        else {
            Collections.sort(l);
            bw.write(sum+"\n"+l.get(0));
        }
        bw.close();
    }
}
