class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count=0;
        int num=0;
        
        //answer배열 length를 확인하기 위한 count 값 설정
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%divisor==0) {
                count++;
            }
        }
        //나누어 떨어지는 값이 없으면 answer[] 배열에 -1값 저장 후 리턴
        if (count==0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];
        //%divisor==0 인 값을 중복문을 통해 answer배열에 값을 저장
        for (int i=0, j=0; i<arr.length; i++) {
            if (arr[i]%divisor==0) {
                answer[j]=arr[i];
                j++;
            }
        }

        //배열 오름차순 정렬
        for (int i=0; i<answer.length; i++){
            for (int j=i+1; j<answer.length; j++) {
                if (answer[j] < answer [i]) {
                    int temp=answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}