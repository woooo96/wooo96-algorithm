import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int count=s.nextInt();
        String num=s.next();
        int StrtoInt;
        int sum=0;
        for (int i=0; i<count; i++){
            sum+=num.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}