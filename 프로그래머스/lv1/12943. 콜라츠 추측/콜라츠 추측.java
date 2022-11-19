class Solution {
    public int solution(int num) {
        int answer = 0;
        long var=num;
        int n=0;
        if(num==1) {
            answer=0;
            return answer;
        }
        
        while (true) {
            if (var%2==0) {
                var/=2;
            } else {
                var=var*3+1;
            }

            n++;
            if (var==1) {
                answer=n;
                return answer;
            }

            if (n>=500) {
                answer=-1;
                return answer;
            }

        }
    }
}