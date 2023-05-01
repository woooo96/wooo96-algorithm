import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[26];
        Scanner s = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = s.next();

        for (int i = 0; i < array.length; i++) array[i]=-1;
        for (int i = str.length()-1; i >= 0; i--) {
            array[str.charAt(i)-97]=i;
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i]+" ");
        }
        bw.close();
    }
}