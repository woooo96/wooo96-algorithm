import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }

        int total = 0;

        while (pq.size() > 1) {
            int first = pq.poll();  // 가장 작은 묶음
            int second = pq.poll(); // 그 다음 작은 묶음

            int sum = first + second;
            total += sum;

            pq.add(sum); // 합친 묶음을 다시 큐에 넣기
        }

        System.out.println(total);
    }
}