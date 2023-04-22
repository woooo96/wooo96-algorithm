import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] cnt = new int[N+1];
        int peopleCnt=0;
        List<Answer> l = new ArrayList<>();
        int people = stages.length;
        for (int i = 0; i < stages.length; i++) cnt[stages[i]-1]++;

        for (int i = 0; i < cnt.length; i++) {
            if(i >= N) break;
            else {
                l.add(new Answer((float)cnt[i]/(people-peopleCnt), i));
                peopleCnt+=cnt[i];
            }
        }

        for (int i = 0; i < l.size()-1; i++) {
            for (int j = i+1; j < l.size(); j++) {
                if(l.get(i).f < l.get(j).f || (l.get(i).f == l.get(j).f && l.get(i).idx > l.get(j).idx)) {
                    Answer temp = new Answer(l.get(i).f, l.get(i).idx);
                    l.set(i, new Answer(l.get(j).f,l.get(j).idx));
                    l.set(j, new Answer(temp.f, temp.idx));
                }
            }
        }
        for (int i = 0; i < l.size(); i++) {
            answer[i]=l.get(i).idx+1;
        }
        return answer;
    }

    public class Answer {
        float f;
        int idx;

        public Answer(float f, int idx) {
            this.f = f;
            this.idx = idx;
        }
    }
}