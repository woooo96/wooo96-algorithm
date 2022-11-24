class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp=0;
        if (n> m) {
            temp = n;
            n=m;
            m=temp;
        }

        for (int i=1; i<=n; i++) {
            if (n%i==0 && m%i==0) {
                answer[0] = i;
            }
        }
        answer[1] = n*m/answer[0];
        return answer;
    }
}