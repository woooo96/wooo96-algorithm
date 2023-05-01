import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String fNum = st.nextToken();
        String eNum = st.nextToken();
        int fIntNum=0;
        int eIntNum=0;
        String temp="";
        for (int i = fNum.length()-1; i >= 0; i--) {
            temp+=fNum.charAt(i);
        }
        fIntNum=Integer.parseInt(temp);
        temp="";
        for (int i = eNum.length()-1; i >= 0 ; i--) {
            temp+=eNum.charAt(i);
        }
        eIntNum=Integer.parseInt(temp);
        System.out.println(fIntNum > eIntNum ? fIntNum : eIntNum);
    }
}
