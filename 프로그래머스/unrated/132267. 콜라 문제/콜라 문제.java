class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remainder = 0;


        while(true) {

            answer+=(n/a)*b;
            remainder=n%a;
            n=(n/a)*b+remainder;

            if(n/a<1) {
                break;
            }
        }
        return answer;
    }
}