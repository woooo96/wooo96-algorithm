import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            int num = Integer.parseInt(br.readLine());
            if(num==-1) break;
            List<Integer> l = new ArrayList<>();
            int sum=0;

            for (int i = 1; i <= Math.sqrt(num); i++) {
                if(num%i==0) {
                    if(!l.contains(i)) {
                        l.add(i);
                        sum+=i;
                    }
                    if(!l.contains(num/i)) {
                        if(num/i!=num) {
                            l.add(num/i);
                            sum+=num/i;
                        }
                    }
                }
            }
            if(sum==num) {
                Collections.sort(l);
                bw.write(num+" = ");
                for (int list : l) {
                    if(l.lastIndexOf(list)==l.size()-1) {
                        bw.write(list+"");
                    } else {
                        bw.write(list+" + ");
                    }
                }
            } else bw.write(num+" is NOT perfect.");
            bw.write("\n");
        }
        bw.close();
    }
}
