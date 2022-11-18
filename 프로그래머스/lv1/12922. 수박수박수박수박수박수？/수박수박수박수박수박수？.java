class Solution {
    public String solution(int n) {
        String answer = "";
        String var1 = "수박";
        String var2 = "수";

        for (int i=0; i<n/2; i++) {
            answer+=var1;
        }
        if (n%2!=0) {
            answer+=var2;
        }
        
        return answer;
    }
}