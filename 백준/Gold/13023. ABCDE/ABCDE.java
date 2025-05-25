import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    static int N, M;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static boolean found = false; // 조건 만족 여부

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 사람 수
        M = Integer.parseInt(st.nextToken()); // 친구 관계 수

        graph = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        // DFS 시작
        for (int i = 0; i < N; i++) {
            visited[i] = true;
            dfs(i, 1); // 시작 노드, 깊이 1
            visited[i] = false;

            if (found) break;
        }

        System.out.println(found ? 1 : 0);
    }

    // DFS 탐색: depth는 현재까지 방문한 깊이
    public static void dfs(int node, int depth) {
        if (depth == 5) { // 깊이 5가 되면 조건 만족
            found = true;
            return;
        }

        for (int next : graph[node]) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next, depth + 1);
                visited[next] = false;

                if (found) return; // 조건 만족하면 더 볼 필요 없음
            }
        }
    }
}