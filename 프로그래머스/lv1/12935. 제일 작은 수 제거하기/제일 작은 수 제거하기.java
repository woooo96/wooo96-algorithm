class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] arrOrg=arr.clone();      //원본 배열과 똑같은 배열 생성
        
        //arr.length가 1일 경우는 자신이 최솟값이므로 -1 리턴
        if (arr.length==1) {
            answer=new int[] {-1};
            return answer;
        }
        //arr 배열 내림차순 정렬
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //정렬된 배열에서 마지막 값(최소값) 추출
        int minVal=arr[arr.length-1];
        //answer 배열에 arr배열에서 최소값을 제외한 나머지 값 저장
        for (int i=0, j=0; i<answer.length; i++, j++) {
            if (arrOrg[i] == minVal) {
                answer[i]=arrOrg[++j];
            }
            answer[i]=arrOrg[j];
        }


        return answer;
    }
}