import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int rows, int columns, int[][] queries) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i * columns + j + 1;
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int[] query : queries) {
            answer.add(rotate(matrix, query));
        }
        
        return answer;
    }
    
    private int rotate(int[][] matrix, int[] query) {
        int x1 = query[0] - 1;
        int y1 = query[1] - 1;
        int x2 = query[2] - 1;
        int y2 = query[3] - 1;
        
        int temp = matrix[x1][y1]; // 회전 전에 첫 번째 값을 저장합니다.
        int minVal = temp; // 회전하는 동안 찾은 최소값입니다.
        
        // 위쪽 테두리를 오른쪽으로 이동
        for (int i = x1; i < x2; i++) {
            matrix[i][y1] = matrix[i + 1][y1];
            minVal = Math.min(minVal, matrix[i][y1]);
        }
        
        // 왼쪽 테두리를 아래로 이동
        for (int i = y1; i < y2; i++) {
            matrix[x2][i] = matrix[x2][i + 1];
            minVal = Math.min(minVal, matrix[x2][i]);
        }
        
        // 아래쪽 테두리를 왼쪽으로 이동
        for (int i = x2; i > x1; i--) {
            matrix[i][y2] = matrix[i - 1][y2];
            minVal = Math.min(minVal, matrix[i][y2]);
        }
        
        // 오른쪽 테두리를 위로 이동
        for (int i = y2; i > y1; i--) {
            matrix[x1][i] = matrix[x1][i - 1];
            minVal = Math.min(minVal, matrix[x1][i]);
        }
        
        matrix[x1][y1 + 1] = temp; // 저장해둔 값을 회전한 위치에 넣습니다.
        
        return minVal;
    }
}
