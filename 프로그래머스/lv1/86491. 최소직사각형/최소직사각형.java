class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width=0, hieght=0;
        
        //명함 가로, 세로 정렬
        for (int i = 0, j = 0; i < sizes.length; i++) {
            int temp = 0;
            if (sizes[i][j] < sizes[i][j + 1]) {
                temp = sizes[i][j];
                sizes[i][j] = sizes[i][j + 1];
                sizes[i][j + 1] = temp;
            }
        }
        //가로사이즈 구하기
        for (int i = 0, j = 0; i < sizes.length; i++) {
            if (sizes[i][j] > width) {
                width=sizes[i][j];
            }

        }
        //세로사이즈 구하기
        for (int i = 0, j = 1; i < sizes.length; i++) {
            if (sizes[i][j] > hieght) {
                hieght=sizes[i][j];
            }
        }
        answer=width*hieght;
        return answer;
    }
}