import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> cache = new ArrayList<>(cacheSize);

        if(cacheSize==0) {
            answer=cities.length*5;
            return answer;
        }

        for (int i = 0; i < cities.length; i++) {
            if (cache.contains(cities[i].toLowerCase())) {
                cache.remove(cache.indexOf(cities[i].toLowerCase()));
                cache.add(cities[i].toLowerCase());
                answer+=1;
            } else if(!cache.contains(cities[i].toLowerCase()) && cache.size()==cacheSize) {
                cache.remove(0);
                cache.add(cities[i].toLowerCase());
                answer+=5;
            } else {
               cache.add(cities[i].toLowerCase());
               answer+=5;
            }
        }
        return answer;
    }
}