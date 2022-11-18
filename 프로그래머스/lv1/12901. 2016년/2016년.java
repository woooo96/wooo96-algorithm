class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 1월~12월의 일수를 저장
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int sum=0, day;
        
        //sum 변수에 전 달 까지의 일수를 더함
        for (int i=0; i<a-1; i++) {
            sum+=month[i];
        }
        //sum 변수에 일수를 더해서 총 며칠이 지났는지 계산
        sum+=(b-1);
        //며칠이 지났는지 계산 후 7로 나눠서 나머지 값을 구함
        day=sum%7;
        //answer 변수에 days 배열 인덱스를 day 변수 값으로 설정하여 해당 값 저장
        answer=days[day];

        return answer;
    }
}