import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().trim();
        if(str.isEmpty()) {
            System.out.println("0");
            return;
        }
        System.out.println(str.split(" ").length);
    }
}