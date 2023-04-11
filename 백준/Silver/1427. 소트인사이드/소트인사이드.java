import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.next();
        int[] array = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        int temp=0;
        String answer="";

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]>array[i]) {
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
            answer+=array[i];
        }
        System.out.println(answer);
    }
}