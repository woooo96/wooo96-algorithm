import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        String answer="";
        for (int i = 0; i < count/4; i++) {
            answer+="long ";
        }
        answer+="int";
        System.out.println(answer);
    }
}
