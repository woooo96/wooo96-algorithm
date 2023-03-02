class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xArray = new int[10];
        int[] yArray = new int[10];
        for (int i = 0; i < X.length(); i++) {
            xArray[Character.getNumericValue(X.charAt(i))]++;
        }
        for (int i = 0; i < Y.length(); i++) {
            yArray[Character.getNumericValue(Y.charAt(i))]++;
        }
        int i=9;
        while(i>=0) {
            if(xArray[i]>=1 && yArray[i]>=1) {
                answer+=(xArray[i] <= yArray[i]) ? String.valueOf(i).repeat(xArray[i]) : String.valueOf(i).repeat(yArray[i]);
            }
            i--;
        }
        if(answer.length()==0) {
            answer="-1";
        } else if(answer.charAt(0)=='0') {
            answer="0";
        }
        return answer;
    }
}