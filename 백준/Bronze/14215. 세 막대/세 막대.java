import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[3];
        array[0] = Integer.parseInt(st.nextToken());
        array[1] = Integer.parseInt(st.nextToken());
        array[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(array);
        if((array[0]+array[1]) > array[2]) {
            System.out.println(array[0]+array[1]+array[2]);
        } else {
            System.out.println(array[0]+array[1]+(array[0]+array[1]-1));
        }
    }
}
