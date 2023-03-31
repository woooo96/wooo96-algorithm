import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] tempArray = new int[progresses.length];
        int index = 0;
        int answerTmp=1;
        for (int i = 0; i < progresses.length; i++) {
            int temp=1;
            while(true) {
                if(progresses[i]+(speeds[i]*temp) >= 100) break;
                temp++;
            }
            tempArray[i]=temp;
            if ((i > 0 && tempArray[i] > index) || i==tempArray.length-1) {
                index=tempArray[i];
                answer.add(answerTmp);
                answerTmp=1;
            }
            else answerTmp++;

        }
        
        return answer;
    }
}