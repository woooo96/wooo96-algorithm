class Solution {
    public int solution(String s) {
        int answer = 0;

        char charSet = s.charAt(0);
        if(s.length()==1) {
            answer++;
        }

        for (int i = 0, cnt=1, otherCnt=0; i < s.length()-1; i++) {
            if (charSet==s.charAt(i+1)) {
                cnt++;
            } else {
                otherCnt++;
            }

            if(cnt==otherCnt) {
                answer++;
                if(i+2<s.length()) {
                    charSet=s.charAt(i+2);
                }
                i++;
                cnt=1;
                otherCnt=0;
            }

            if(i+1==s.length()-1) {
                answer++;
            }

        }
        return answer;
    }
}