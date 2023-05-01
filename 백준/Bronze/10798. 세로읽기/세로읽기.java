import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] array = new char[5][];
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = br.readLine().toCharArray();
            maxLength = array[i].length > maxLength ? array[i].length : maxLength;
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    bw.write(array[j][i]);
                } catch (ArrayIndexOutOfBoundsException a) {
                    continue;
                }
            }
        }
        bw.close();
    }
}