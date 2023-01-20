import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<String> s = new ArrayList<>();
        for (int i = 0; i < t.length()-(p.length()-1); i++) {
            String str=t.substring(i, i+(p.length()));
            s.add(str);
        }
        for (int i = 0; i < s.size(); i++) {
            if(Long.parseLong(s.get(i)) <= Long.parseLong(p)){
                answer++;
            }
        }

        return answer;
    }
}