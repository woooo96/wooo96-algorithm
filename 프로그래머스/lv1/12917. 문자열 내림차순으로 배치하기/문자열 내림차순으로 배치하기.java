class Solution {
    public String solution(String s) {
        String answer = "";
        char[] strArr = new char[s.length()];
        for (int i=0; i<strArr.length; i++) {
            strArr[i]=s.charAt(i);
        }
        for (int i=0; i<strArr.length; i++) {
            for (int j=i+1; j<strArr.length; j++) {
                if (strArr[j] > strArr[i]) {
                    char temp=strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
            answer+=strArr[i];
        }
        System.out.println(answer);

        return answer;
    }
}