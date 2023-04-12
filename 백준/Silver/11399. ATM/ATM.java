import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[count];
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            array[i]=Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < count; i++) {
            int insertPoint = i;
            int insertValue = array[i];

            for (int j = i-1; j >= 0; j--) {
                if (array[i] > array[j]) {
                    insertPoint=j+1;
                    break;
                }
                if(j==0) insertPoint=0;
            }
            for (int j = i; j > insertPoint; j--) {
                array[j]=array[j-1];
            }
            array[insertPoint] = insertValue;
        }
        answer[0]=array[0];
        for (int i = 1; i < count; i++) {
            answer[i] = answer[i-1]+array[i];
        }
        int sum =0;
        for (int i = 0; i < answer.length; i++) {
            sum+=answer[i];
        }
        System.out.println(sum);
    }
}