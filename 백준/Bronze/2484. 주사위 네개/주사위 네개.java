import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] ans = new int[cnt][7];

        int maxSum=0;

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                ans[i][Integer.parseInt(st.nextToken())]++;
            }

            int sum=0;
            int twoCnt=0;
            int oneMaxNum=0;

            for (int j = 0; j <= 6; j++) {
                if(ans[i][j]==4) {
                    sum=50000+(j*5000);
                    break;
                } else if (ans[i][j]==3) {
                    oneMaxNum=0;
                    twoCnt=0;
                    sum=10000+(j*1000);
                    break;
                }
                else if (ans[i][j]==2) {
                    oneMaxNum=0;
                    twoCnt++;
                    sum+=j;
                }
                else if (twoCnt==0 && ans[i][j]==1 && j > oneMaxNum) {
                    oneMaxNum=j;
                }
            }
            if(twoCnt!=0) {
                if (twoCnt>=2) {
                    sum=2000+(sum*500);
                } else {
                    sum=1000+(sum*100);
                }
            }
            if(twoCnt==0 && oneMaxNum!=0) {
                sum = oneMaxNum*100;
            }
            maxSum = sum>maxSum ? sum : maxSum;
        }

        System.out.println(maxSum);
    }
}