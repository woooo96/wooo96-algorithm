class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            boolean search = false;
            for (int j = 0; j < numbers.length; j++) {
                if(i==numbers[j]) {
                    search=true;
                    break;
                }
            }
            if(search==false) {
                answer+=i;
            }

        }
        return answer;
    }
}