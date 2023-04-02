import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int index = s.nextInt();
        
        System.out.println(str.charAt(index-1));
    }
}