class Solution {
    public String solution(String s) {
        String answer = "";
        int index=0;
        if(s.length()%2==1) {
            answer = String.valueOf(s.charAt(s.length()/2));
        } else {
            answer = String.valueOf(s.charAt(s.length()/2-1))+String.valueOf(s.charAt(s.length()/2));
        }
        System.out.println(answer);
        return answer;
    }
}