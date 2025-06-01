import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int vertex, weight;
        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    static ArrayList<Node>[] tree;
    static boolean[] visited;
    static int maxDistance = 0;
    static int farthestNode = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());

        tree = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            tree[i] = new ArrayList<>();
        }

        // 트리 입력 받기
        for (int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) break;
                int weight = Integer.parseInt(st.nextToken());
                tree[from].add(new Node(to, weight));
            }
        }

        // 1차 DFS: 임의의 점(1번)에서 가장 먼 노드 찾기
        visited = new boolean[V + 1];
        dfs(1, 0);

        // 2차 DFS: 가장 먼 노드에서 다시 DFS → 최대 거리 구하기
        visited = new boolean[V + 1];
        dfs(farthestNode, 0);

        System.out.println(maxDistance);
    }

    static void dfs(int current, int sum) {
        visited[current] = true;

        if (sum > maxDistance) {
            maxDistance = sum;
            farthestNode = current;
        }

        for (Node next : tree[current]) {
            if (!visited[next.vertex]) {
                dfs(next.vertex, sum + next.weight);
            }
        }
    }
}
