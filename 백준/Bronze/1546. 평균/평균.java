import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//입력받을 과목의 수 
		int N = sc.nextInt();
		
		int max = 0;
		int sum = 0;
		for(int i = 0; i < N; i ++) {
			int tmp = sc.nextInt();
			sum += tmp;
			if (tmp > max) max = tmp;
		}
		System.out.print(sum*100.0 / max / N);	
	}
}