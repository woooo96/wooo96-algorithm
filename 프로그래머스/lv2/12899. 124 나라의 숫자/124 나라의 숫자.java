public class Solution{
    public String solution(int n) {
        String answer = "";
        StringBuilder st = new StringBuilder();
        while(n>=3) {
            int num;
            if(n%3 == 0) {
                num=4;
                n=(n/3)-1;
            } else {
                num=n%3;
                n=(n/3);
            }
            st.insert(0, num);
        }
        if(n!=0) {
            st.insert(0, n);
        }
        answer=st.toString();
        return answer;
    }
}