import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        
        int[] sorted = A.clone();
        Arrays.sort(sorted);
        
        Map<Integer, Queue<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            indexMap.putIfAbsent(sorted[i], new LinkedList<>());
            indexMap.get(sorted[i]).offer(i);
        }
        
        int maxDiff = 0;
        for (int i = 0; i < N; i++) {
            int correctIndex = indexMap.get(A[i]).poll();
            maxDiff = Math.max(maxDiff, i - correctIndex);
        }
        
        bw.write((maxDiff + 1) + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
