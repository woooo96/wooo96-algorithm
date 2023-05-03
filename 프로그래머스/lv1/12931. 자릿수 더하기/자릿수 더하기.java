import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int num=1;
        int count=1;
        
        while(true) {
            if (n/num < 10) {
                break;
            }
            num*=10;
            count++;
        }
        
        for (int i=0; i<count; i++){
            int temp=n/num;
            n-=temp*num;
            answer+=temp;
            num/=10;
        }



        return answer;
    }
}