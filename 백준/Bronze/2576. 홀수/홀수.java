import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int minNum=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0; i<7; i++) {
            int num = s.nextInt();
            if (num%2!=0) {
                sum+=num;
                if(num<minNum) minNum=num;
            }
        }
        if(sum==0) {
            System.out.println("-1");
        } else {
            System.out.println(sum+"\n"+minNum);
        }

    }
}