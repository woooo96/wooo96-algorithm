import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상, 하
    static int[] dy = {0, 0, -1, 1}; // 좌, 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited = new boolean[N][M];

        // 미로 정보 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        // BFS 시작
        bfs(0, 0);

        // 도착 위치까지의 최소 칸 수 출력
        System.out.println(maze[N - 1][M - 1]);
    }

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int curX = pos[0];
            int curY = pos[1];

            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M) {
                    if (!visited[nextX][nextY] && maze[nextX][nextY] == 1) {
                        visited[nextX][nextY] = true;
                        maze[nextX][nextY] = maze[curX][curY] + 1;
                        queue.offer(new int[]{nextX, nextY});
                    }
                }
            }
        }
    }
}