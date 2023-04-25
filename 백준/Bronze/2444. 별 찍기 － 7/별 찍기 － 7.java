import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();

        for (int i = 1; i <= cnt*2-1; i++) {
            for (int j = 0; j < Math.abs(cnt-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(cnt-Math.abs(cnt-i))-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
