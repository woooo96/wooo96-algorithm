import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        if(str.length()%2!=0) str = str.substring(0,str.length()/2)+str.substring(str.length()/2+1);
        int pointer1 = str.length()/2-1;
        int pointer2 = str.length()/2;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(pointer1--)!=str.charAt(pointer2++)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}