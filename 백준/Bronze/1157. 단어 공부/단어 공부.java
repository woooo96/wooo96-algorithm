import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next().toUpperCase();
        Map<Character, Integer> m = new HashMap<>();
        int maxCnt = 0;
        char answer=' ';
        boolean doubleCheck = false;

        for (int i = 0; i < str.length(); i++) {
            m.put(str.charAt(i), m.getOrDefault(str.charAt(i), 0)+1);
        }

        for ( char strKey : m.keySet() ) {
            if (maxCnt<m.get(strKey)) {
                maxCnt=m.get(strKey);
                answer=strKey;
                doubleCheck = false;
            } else if (maxCnt==m.get(strKey)) {
                doubleCheck = true;
            }
        }
        if (doubleCheck==true) answer = '?';

        System.out.println(answer);
    }
}
