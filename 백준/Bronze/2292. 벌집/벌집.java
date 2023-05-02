import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int num2 = 1;
        int i = 1;
        while (num2 < num) {
            num2 = num2 + (6 * i);
            i++;
        }
        System.out.println(i);
    }
}