class Solution {
    public int[] solution(long n) {
        long num = 1;    //자리수를 체크하기 위한 변수
        int count=1;    //자리수에 따른 반복문을 돌리기 위한 변수
        //while문을 돌리면서 자연수 N이 몇자리인지 찾기
        while(true) {
            if (n/num < 10) {
                break;
            }
            num*=10;
            count++;
        }
        int[] answer = new int[count];

        for (int i=count-1; i>=0; i--) {
            int temp=(int)(n/num);
            n-=temp*num;
            num/=10;
            answer[i]=temp;
        }
        return answer;
    }
}