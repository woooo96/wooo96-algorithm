import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> m = new HashMap<>();
        int dial = 3;
        m.put('A', 0+dial);
        m.put('B', 0+dial);
        m.put('C', 0+dial);
        m.put('D', 1+dial);
        m.put('E', 1+dial);
        m.put('F', 1+dial);
        m.put('G', 2+dial);
        m.put('H', 2+dial);
        m.put('I', 2+dial);
        m.put('J', 3+dial);
        m.put('K', 3+dial);
        m.put('L', 3+dial);
        m.put('M', 4+dial);
        m.put('N', 4+dial);
        m.put('O', 4+dial);
        m.put('P', 5+dial);
        m.put('Q', 5+dial);
        m.put('R', 5+dial);
        m.put('S', 5+dial);
        m.put('T', 6+dial);
        m.put('U', 6+dial);
        m.put('V', 6+dial);
        m.put('W', 7+dial);
        m.put('X', 7+dial);
        m.put('Y', 7+dial);
        m.put('Z', 7+dial);

        Scanner s = new Scanner(System.in);
        String str = s.next();
        int answer=0;
        for (int i = 0; i < str.length(); i++) {
            answer+=m.get(str.charAt(i));
        }
        System.out.println(answer);
    }
}
