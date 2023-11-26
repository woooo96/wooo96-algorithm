class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length-2; i++) {
            for (int j = i+1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                  break;
                }
            }
        }
        answer[prices.length-2] = 1;
        answer[prices.length-1] = 0;

        return answer;
    }
}