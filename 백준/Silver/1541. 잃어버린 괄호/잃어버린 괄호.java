import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();

        // '-'를 기준으로 split
        String[] subExprs = expr.split("-");

        int sum = 0;

        // 첫 번째 토큰은 무조건 더하기
        sum += computeSum(subExprs[0]);

        // 두 번째부터는 모두 괄호로 묶어서 빼기
        for (int i = 1; i < subExprs.length; i++) {
            sum -= computeSum(subExprs[i]);
        }

        System.out.println(sum);
    }

    // '+'를 기준으로 split 후 총합 계산
    private static int computeSum(String s) {
        String[] nums = s.split("\\+");
        int total = 0;
        for (String num : nums) {
            total += Integer.parseInt(num);
        }
        return total;
    }
}
