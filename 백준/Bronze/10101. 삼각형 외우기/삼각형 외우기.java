import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> l = new ArrayList<>();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        if(A+B+C!=180) {
            System.out.println("Error");
            return;
        }
        if(!l.contains(A)) l.add(A);
        if(!l.contains(B)) l.add(B);
        if(!l.contains(C)) l.add(C);
        if(l.size()==3) System.out.println("Scalene");
        else if(l.size()==2) System.out.println("Isosceles");
        else System.out.println("Equilateral");
    }
}