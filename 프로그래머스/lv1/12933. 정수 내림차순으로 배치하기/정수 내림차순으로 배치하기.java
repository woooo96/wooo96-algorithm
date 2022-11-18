class Solution {
    public long solution(long n) {
        long answer = 0;
        long num=1;
        int count=1;

        while(true) {
            if(n/num < 10) {
                break;
            }
            num*=10;
            count++;
        }
        int temp[] = new int[count];

        for (int i=0; i<count; i++) {
            int tempNum=(int)(n/num);
            n-=tempNum*num;
            temp[i]=tempNum;
            num/=10;
        }

        for(int i=0; i<count; i++) {
            for (int j=i+1; j<count; j++) {
                if (temp[j] > temp[i]) {
                    int tempNum=temp[i];
                    temp[i]=temp[j];
                    temp[j]=tempNum;
                }
            }
        }
        num=1;

        for (int i=count-1; i>=0; i--) {
            answer+=(num*temp[i]);
            num*=10;
        }

        return answer;
    }
}