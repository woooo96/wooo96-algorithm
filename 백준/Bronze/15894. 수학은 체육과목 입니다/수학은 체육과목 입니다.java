import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger num = new BigInteger(s.next());
        System.out.println(num.multiply(BigInteger.valueOf(4l)));
    }
}