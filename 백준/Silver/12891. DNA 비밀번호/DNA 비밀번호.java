import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int checkArr[];
	static int nowArr[];
	static int correctDna = 0;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int len = Integer.parseInt(st.nextToken());	//문자의 길이 
		int arrLen = Integer.parseInt(st.nextToken());	//부분배열의 길이 
		
		int answer = 0;
		
		char arr[] = new char[len]; //문자열
		checkArr = new int[4];	//dna 규칙 배열
		nowArr = new int[4];	//현재 부분문자열 배열의 dna 상태 배열  
		arr = br.readLine().toCharArray();
		
		st = new StringTokenizer(br.readLine());
		br.close();
		
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) {
				correctDna++;
			}
		}
		for (int i = 0; i < arrLen; i++) {
			add(arr[i]);		
		}

		if (correctDna == 4) answer++;
		
		for (int i = arrLen; i < len; i++) {
			int j = i - arrLen;
			add(arr[i]);
			remove(arr[j]);
			if (correctDna == 4) answer++;
		}
		
		System.out.println(answer);

	}
	
	private static void add (char c) {
		switch (c) {
		case 'A':
			nowArr[0]++;
			if (nowArr[0] == checkArr[0]) correctDna++;
			break;
		case 'C':
			nowArr[1]++;
			if (nowArr[1] == checkArr[1]) correctDna++;
			break;
		case 'G':
			nowArr[2]++;
			if (nowArr[2] == checkArr[2]) correctDna++;
			break;
		case 'T':
			nowArr[3]++;
			if (nowArr[3] == checkArr[3]) correctDna++;
			break;
		}
	}
	
	private static void remove (char c) {
		switch (c) {
		case 'A':
			if (nowArr[0] == checkArr[0]) correctDna--;
			nowArr[0]--;
			break;
		case 'C':
			if (nowArr[1] == checkArr[1]) correctDna--;
			nowArr[1]--;
			break;
		case 'G':
			if (nowArr[2] == checkArr[2]) correctDna--;
			nowArr[2]--;
			break;
		case 'T':
			if (nowArr[3] == checkArr[3]) correctDna--;
			nowArr[3]--;
			break;
		}
	}
}


