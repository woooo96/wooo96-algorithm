import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	// N개의 수
	int N = sc.nextInt();
	// 입력받은 숫자
	String inStr = sc.next();
	
	char[] strToArr = inStr.toCharArray();
	int sum = 0;
	for (int i = 0; i < N; i++) {
		//합 구하기
		sum +=  Character.getNumericValue(strToArr[i]);
	}
	System.out.print(sum);
	sc.close();
	}

}