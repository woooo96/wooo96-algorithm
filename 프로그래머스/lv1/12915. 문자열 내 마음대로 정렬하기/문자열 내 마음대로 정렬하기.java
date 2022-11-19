import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        for (int i=0; i<strings.length; i++) {
            strings[i]=strings[i].charAt(n)+strings[i];
        }
        Arrays.sort(strings);
        answer = new String[strings.length];

        String s= "";
        for (int i=0; i<answer.length; i++) {
            for (int j=1; j<strings[i].length(); j++) {
                s+=strings[i].charAt(j);
                if(j==strings[i].length()-1) {
                    answer[i]=s;
                }
            } s="";
        }
        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }
}