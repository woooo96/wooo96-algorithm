class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] weights = {781, 156, 31, 6, 1}; // 각 자리수마다 가질 수 있는 가중치
        char[] chars = {'A', 'E', 'I', 'O', 'U'};
        
        for(int i=0; i<word.length(); i++) {
            for(int j=0; j<chars.length; j++) {
                if(word.charAt(i) == chars[j]) {
                    answer += 1 + j * weights[i];
                }
            }
        }
        
        return answer;
    }
}