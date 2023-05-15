import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, String> m = new TreeMap<>();
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String[] arr = br.readLine().split(" ");
            m.put(arr[0], arr[1]);
        }

        List<String> l = new ArrayList<>();
        for (String str : m.keySet()) {
            if(m.get(str).equals("enter")) {
                l.add(str);
            }
        }

        for (int i = l.size()-1; i >= 0; i--) {
            bw.write(l.get(i)+"\n");
        }

        bw.close();
    }
}
