class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] sArray=new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            if (65<=s.charAt(i) && s.charAt(i)<=90) {
                if(s.charAt(i)+n>90) {
                    sArray[i]=(char)(s.charAt(i)+n-26);
                } else {
                    sArray[i]=(char)(s.charAt(i)+n);
                }
            } else if (97<=s.charAt(i) && s.charAt(i)<=122) {
                if(s.charAt(i)+n>122) {
                    sArray[i]=(char)(s.charAt(i)+n-26);
                } else {
                    sArray[i]=(char)(s.charAt(i)+n);
                }
            } else if (s.charAt(i)==' ') {
                sArray[i]=' ';
            }
        }
        for (int i=0; i<sArray.length; i++) {
            if(sArray[i]==' ') {
                answer+=" ";
            } else {
                answer+=sArray[i];
            }
        }
        return answer;
    }
}