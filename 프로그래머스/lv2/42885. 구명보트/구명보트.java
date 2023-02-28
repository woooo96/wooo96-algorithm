import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> peopleList = new ArrayList<>();
        Arrays.sort(people);
        for (int i = 0; i < people.length; i++) {
            peopleList.add(i, people[i]);
        }

        int i=1;
        while(peopleList.size()>0) {
            if (peopleList.size()-i==0) {
                peopleList.remove(0);
                i=1;
                answer++;
                continue;
            }
            if (peopleList.get(0)+peopleList.get(peopleList.size()-i) <= limit) {
                peopleList.remove(0);
                peopleList.remove(peopleList.size()-i);
                i=1;
                answer++;
            } else {
                i++;
            }
        }
        return answer;
    }
}