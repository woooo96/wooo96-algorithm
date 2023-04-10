import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= cnt; i++) {
            q.add(i);
        }
        while(q.size()>1) {
            q.poll();
            int num = q.poll();
            q.add(num);
        }
        System.out.println(q.peek());
    }
}