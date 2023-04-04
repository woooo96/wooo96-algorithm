import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if (m.containsKey(keymap[i].charAt(j))) {
                    m.put(keymap[i].charAt(j), (m.get(keymap[i].charAt(j)) > j+1 ? j+1 : m.get(keymap[i].charAt(j))));
                } else m.put(keymap[i].charAt(j), j+1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if(m.containsKey(targets[i].charAt(j))) {
                    answer[i]+=m.get(targets[i].charAt(j));
                } else {
                    answer[i]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}