import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] tempArray = new int[progresses.length];
        int index = 0;
        int answerTmp=0;
        for (int i = 0; i < progresses.length; i++) {
            int temp=1;
            while(true) {
                if(progresses[i]+(speeds[i]*temp) >= 100) break;
                temp++;
            }
            tempArray[i]=temp;
        }

        index = tempArray[0];
        for (int i = 1; i < tempArray.length; i++) {
            if(tempArray[i] > index) {
                answer.add(++answerTmp);
                answerTmp=0;
                index=tempArray[i];
            } else answerTmp++;

            if (i==tempArray.length-1) answer.add(++answerTmp);
        }

        return answer;
    }
}