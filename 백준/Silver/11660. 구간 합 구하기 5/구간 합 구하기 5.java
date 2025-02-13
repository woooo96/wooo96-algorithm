import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nCnt = Integer.parseInt(st.nextToken());
		int qCnt = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[nCnt+1][nCnt+1];
		for (int i = 1; i <= nCnt; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= nCnt; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int sumArr[][] = new int[nCnt+1][nCnt+1];
		for (int i = 1; i <= nCnt; i++) {
			for (int j = 1; j <= nCnt; j++) {
				//구간 합 구하기 
				sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + arr[i][j];
			}
		}
		for (int i = 0; i < qCnt; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int sum = sumArr[x2][y2] - sumArr[x1-1][y2] - sumArr[x2][y1-1] + sumArr[x1-1][y1-1];
			System.out.println(sum);
		}
	}
}