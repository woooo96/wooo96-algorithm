import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> hamburger = new ArrayList<>();
        for (int i= 0;  i< ingredient.length; i++) {
            hamburger.add(ingredient[i]);

            if(hamburger.size()>3 && hamburger.get(hamburger.size()-4)==1 && hamburger.get(hamburger.size()-3)==2 && hamburger.get(hamburger.size()-2)==3 && hamburger.get(hamburger.size()-1)==1) {
                answer+=1;

                for (int j = 0; j < 4; j++) {
                    hamburger.remove(hamburger.size()-1);
                }

            }
        }
        return answer;
    }
}