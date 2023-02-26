import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[][] arrays = new int[score.length/m][m];
        Arrays.sort(score);
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < m; j++) {
                arrays[i][j]=score[(score.length-(j+1))-(i*m)];
            }
            answer+=arrays[i][arrays[i].length-1]*m;
        }
        return answer;
    }
}