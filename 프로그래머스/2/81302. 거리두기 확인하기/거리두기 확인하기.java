class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for (int i = 0; i < 5; i++) {
            answer[i] = checkRoom(places[i]) ? 1 : 0;
        }
        
        return answer;
    }
    
    private boolean checkRoom(String[] room) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (room[i].charAt(j) == 'P') {
                    if (!isSafe(room, i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean isSafe(String[] room, int x, int y) {
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                if (room[nx].charAt(ny) == 'P') {
                    // 바로 옆에 사람이 있는 경우
                    if (i < 4) {
                        return false;
                    } else { // 대각선에 사람이 있는 경우, 파티션 확인
                        if (i == 4) {
                            if (room[x - 1].charAt(y) != 'X' || room[x].charAt(y - 1) != 'X') {
                                return false;
                            }
                        } else if (i == 5) {
                            if (room[x - 1].charAt(y) != 'X' || room[x].charAt(y + 1) != 'X') {
                                return false;
                            }
                        } else if (i == 6) {
                            if (room[x + 1].charAt(y) != 'X' || room[x].charAt(y - 1) != 'X') {
                                return false;
                            }
                        } else if (i == 7) {
                            if (room[x + 1].charAt(y) != 'X' || room[x].charAt(y + 1) != 'X') {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        // 한 칸 떨어진 곳에 사람이 있는 경우, 파티션 확인
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i] * 2;
            int ny = y + dy[i] * 2;
            
            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                if (room[nx].charAt(ny) == 'P') {
                    int mx = x + dx[i];
                    int my = y + dy[i];
                    if (room[mx].charAt(my) != 'X') {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}