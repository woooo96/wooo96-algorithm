import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int num = 2;

        for (int i = 0, j=1; i < N; i++, j=j*2) {
            num += j;
        }
        System.out.println(num*num);
    }
}