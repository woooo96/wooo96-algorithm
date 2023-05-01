import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int kilogram = s.nextInt();
        if(kilogram%5 == 0) {
            System.out.println(kilogram/5);
            return;
        }
        for (int i = kilogram/5; i >= 0; i--) {
            if((kilogram-(5*i))%3==0) {
                System.out.println(i+((kilogram-(5*i))/3));
                return;
            }
        }
        System.out.println("-1");
    }
}