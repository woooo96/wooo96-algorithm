public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] countArr=new int[arr.length]; //중복되지 않은 숫자의 위치를 담을 배열 생성
        countArr[0]=1;  //첫번째 값은 무조건 새로운 값이므로 1
        int count=1;    //answer배열의 크기를 지정하기 위한 count 변수 생성

        //arr[i]와 arr[i+1]값이 같을 경우는 같은 값이기 때문에 count 하지 않고 continue로 반복문으로 돌아감
        for (int i=0; i<arr.length-1; i++) {
            if(arr[i]==arr[i+1]) {
                continue;
            } else {
                countArr[i+1]++;
                count++;
            }
        }
        //count값으로 배열 생성
        answer = new int[count];
        //countArr값을 확인해서 answer 베열에 arr배열에 있는 값을 대입 
        for (int i=0,j=0; i<countArr.length; i++) {
            if(countArr[i]==1) {
                answer[j]=arr[i];
                j++;

            }
        }
        return answer;
    }
    
}