import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[] array = new int[cnt];

        int temp=0;

        for (int i = 0; i < cnt; i++) {
            array[i]= s.nextInt();
        }

        for (int i = 0; i < cnt-1; i++) {
            for (int j = 0; j < cnt-1-i; j++) {
                if (array[j] > array[j+1]) {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}