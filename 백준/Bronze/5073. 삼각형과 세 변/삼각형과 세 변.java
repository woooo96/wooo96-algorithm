import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] array = new int[3];
            array[0] = Integer.parseInt(st.nextToken());
            array[1] = Integer.parseInt(st.nextToken());
            array[2] = Integer.parseInt(st.nextToken());
            if(array[0]==0 && array[1]==0 && array[2]==0) break;

            Arrays.sort(array);
            if(array[2]>=array[0]+array[1]) {
                bw.write("Invalid"+"\n");
                continue;
            }

            if(array[0] == array[1] && array[1] == array[2]) {
                bw.write("Equilateral"+"\n");
            } else if (array[0] == array[1] || array[1] == array[2] || array[1] == array[2]) {
                bw.write("Isosceles"+"\n");
            } else {
                bw.write("Scalene"+"\n");
            }
        }
        bw.close();
    }
}
