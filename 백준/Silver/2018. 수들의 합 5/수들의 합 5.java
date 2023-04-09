import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        //더하는 케이스 중 N 하나만으로 나타낼 수 있는 경우를 하나 더해서 1로 초기화해줌
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;

        while(endIndex != N) {
            if (sum == N) {
                count++;
                endIndex++;
                sum = sum+endIndex;
            } else if (sum > N) {
                sum = sum-startIndex;
                startIndex++;
            } else {
                endIndex++;
                sum = sum+endIndex;
            }
        }
        System.out.println(count);
    }
}
