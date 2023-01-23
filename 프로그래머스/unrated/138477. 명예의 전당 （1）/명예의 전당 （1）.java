import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        for (int i = 0; i < k-1; i++) {
            int[] temp = new int[i+1];
            for (int j = 0; j <= i; j++) {
                temp[j] = score[j];
            }
            Arrays.sort(temp);
            answer[i]=temp[0];
                        if(i==score.length-1) {
                return answer;
            }
        }

        for (int i = k; i <= score.length; i++) {
            int[] temp = new int[i];
            for (int j = 0; j < i; j++) {
                temp[j] = score[j];
            }
            Arrays.sort(temp);
            answer[i-1] = temp[i-k];
        }

        return answer;
    }
}