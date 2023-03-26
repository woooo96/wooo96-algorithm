import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> h = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            h.put(clothes[i][1], h.getOrDefault(clothes[i][1], 0)+1);
        }

        if(h.size()>1) {
            int temp=1;
            for (Integer key : h.values()) {
                temp*=(key+1);
            }
            answer=temp-1;
        } else {
            answer=clothes.length;
        }

        return answer;
    }
}