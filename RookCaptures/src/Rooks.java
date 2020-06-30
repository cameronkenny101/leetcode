public class Rooks {

    public int numRookCaptures(char[][] board) {
        int total = 0;
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board[i][j] == 'R')
                    total += capture(board, i, j);
            }
        }
        return total;
    }

    public int capture(char[][] board, int i, int j) {
        int pawns = 0;
        for(int x = i; x > 0; x--) {
            if(board[x][j] == 'p') {
                pawns++;
                break;
            }
            else if(board[x][j] == 'B') {
                break;
            }
        }

        for(int x = i; x < 8; x++) {
            if(board[x][j] == 'p') {
                pawns++;
                break;
            }
            else if(board[x][j] == 'B') {
                break;
            }
        }

        for(int y = j; y > 0; y--) {
            if(board[i][y] == 'p') {
                pawns++;
                break;
            }
            else if(board[i][y] == 'B') {
                break;
            }
        }

        for(int y = j; y < 8; y++) {
            if(board[i][y] == 'p') {
                pawns++;
                break;
            }
            else if(board[i][y] == 'B') {
                break;
            }
        }
        return pawns;
    }

}
