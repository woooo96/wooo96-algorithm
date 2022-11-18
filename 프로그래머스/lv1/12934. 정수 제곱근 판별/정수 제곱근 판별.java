class Solution {
    public long solution(long n) {
        long answer = 0;
        long num=1;

        //while(true)는 break;를 만나지 못하면 계속 돌기 떄문에, num*num<N으로 조건식을 줌
        while(num<n) {
            //제곱근 체크
            if(num*num==n) {
                break;
            }
            num++;
        }
        //1의 제곱근은 1인데 이걸 찾지 못해서 계속 틀렸다. (프로그래머스 18번케이스인듯..)
        if(num==1){
            return 4;
        } else if (num==n) {
            return -1;
        } else {
            answer = (num+1)*(num+1);
        }
        return answer;
    }
}