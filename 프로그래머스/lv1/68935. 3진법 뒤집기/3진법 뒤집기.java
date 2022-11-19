class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] remainder;
        int count=1;
        int temp=n;
        while (true) {
            if(temp/3==0) {
                break;
            }
            temp/=3;
            count++;
        }
        remainder = new int[count];

        //3진법 앞뒤 반전
        for (int i=0; i<count; i++) {
            remainder[i]=n%3;
            n/=3;
        }
        //3진법 -> 10진법
        for (int i=remainder.length-1, j=1; i>=0; i--) {
            answer+=remainder[i]*j;
            j*=3;
        }
        return answer;
    }
}