import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int[] countArr = new int[200];  //numbers 값 중 더했을 때의 최대값인 200(100+100)으로 배열 생성
        int count=0;
        //numbers 배열을 순회하며 + 했을 때 나올 수 있는 값들을 countArr 배열 인덱스에 ++
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int sum=numbers[i]+numbers[j];
                countArr[sum]++;
            }
        }
        //countArr 배열에서 값이 0이지 않은 경우는 더해졌던 것과 같은 케이스이므로 count
        for (int i=0; i<countArr.length; i++) {
            if (countArr[i] != 0) {
                count++;
            }
        }
        //count 한 값으로 answer 배열 크기 설정
        answer = new int[count];

        //countArr중 값이 있는 인덱스(더해진 값)값을 answer 배열에 데이터 삽입
        for (int i=0, j=0; i<countArr.length; i++) {
            if (countArr[i]!=0) {
                answer[j]=i;
                j++;
            }
        }
        //answer배열 정렬
        Arrays.sort(answer);
        return answer;
    }
}