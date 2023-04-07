import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int sub=s.nextInt();
        int a[]=new int[sub];
        double sum=0;
        for (int i=0; i<a.length; i++){
            a[i]=s.nextInt();
        }
        double max=a[0];
        for (int n=1; n<a.length; n++){
            if(max<a[n]) max=a[n];
        }
        for (int m=0; m<a.length; m++){
            sum=sum+a[m]/max*100;
        }
        System.out.println(sum/sub);
    }
}