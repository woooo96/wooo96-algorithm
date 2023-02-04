class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }

        while (true) {
            n++;
            String x = Integer.toBinaryString(n);
            int xCount = 0;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '1') {
                    xCount++;
                }
            }
            if (count == xCount) {
                answer = n;
                return answer;
            }
        }
    }
}