import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nCnt = Integer.parseInt(st.nextToken());
		int qCnt = Integer.parseInt(st.nextToken());
		
		long[] sumArr = new long[nCnt + 1];
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i < nCnt+1; i++) {
			sumArr[i] = sumArr[i-1] +Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < qCnt; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			System.out.println(sumArr[num2] - sumArr[num1 -1]) ;
		}
		
	}

}
