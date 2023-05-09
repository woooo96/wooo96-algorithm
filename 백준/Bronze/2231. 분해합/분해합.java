import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i = 0; i <= num; i++) {
            int sum=0;
            String[] arr = Integer.toString(i).split("");
            for (int j = 0; j < arr.length; j++) {
                sum+=Integer.parseInt(arr[j]);
            }
            if(sum+i==num) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");
    }
}