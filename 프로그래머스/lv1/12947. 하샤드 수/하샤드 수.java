class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int var=x;
        int count=1, num=1, sum=0;
        // 자리수 체크
        while (true) {
            if (x/num < 10) {
                break;
            }
            num*=10;
            count++;
        }
        //자리수 더하기
        for (int i=0; i<count; i++) {
            int temp=x/num;
            sum+=temp;
            x-=temp*num;
            num/=10;
        }
        //answer 값 설정
        if (var%sum==0) {
            answer=true;
            System.out.println(answer);
            return answer;
        } else {
            answer=false;
            System.out.println(answer);
            return answer;

        }


    }
}