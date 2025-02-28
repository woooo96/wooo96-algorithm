import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int[] arr = new int[num];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		Arrays.sort(arr);
		
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			int left = 0;
			int right = num-1;
			
			while (left < right) {
				if (arr[left] + arr[right] == arr[i]) {
                   if (left != i && right != i) {
                       answer++;
                       break;
                   } else if (left == i) {
                       left++;
                   } else if (right == i) {
                       right--;
                   }
				} else if (arr[left] + arr[right] < arr[i]) {
					left++;
				} else {
					right--;
				}
			}
		}
		System.out.println(answer);
	}
}
