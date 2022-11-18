class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sArray=new char[s.length()];
        for (int i=0; i<sArray.length; i++) {
            sArray[i]=s.charAt(i);
        }

        for (int i=0, j=1; i<sArray.length; i++) {
            if (sArray[i]==' ') {
                j=1;
                continue;
            } else if(j%2==1) {
                if (97 <= sArray[i] && 122 >= sArray[i]) {
                    sArray[i]=(char)((int)sArray[i]-32);
                }
                j++;
            } else if(j%2==0) {
                if (65 <= sArray[i] && 90 >= sArray[i]) {
                    sArray[i]=(char)((int)sArray[i]+32);
                } j++;
            }
        }
        for (int i=0; i<s.length(); i++) {
            answer+=sArray[i];
        }
        return answer;
    }
}