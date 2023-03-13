class Solution {
    public long solution(int n) {
        long answer = 0;
        int[] arr = new int[2001];
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < n+1; i++) {
            arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
        }
        answer=arr[n];
        return answer;
    }
}