class Solution
{
    public int solution(int[][] board) {
        int answer = 0;
        boolean one = false;
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 1) one = true;
        }
        if (one == false) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][0] == 1) one = true;
            }
        }
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] != 0)
                    board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
                answer = Math.max(board[i][j], answer);
            }
        }
        if (answer==0 && one==true) answer=1;
        return answer * answer;
    }
}