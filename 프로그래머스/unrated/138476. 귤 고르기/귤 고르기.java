import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> t = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            t.put(tangerine[i], t.getOrDefault(tangerine[i], 0)+1);
        }

        List<Integer> list=new ArrayList<>(t.values());
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            k=k-list.get(i);
            answer++;
            if(k<1) {
                break;
            }
        }
        return answer;
    }
}