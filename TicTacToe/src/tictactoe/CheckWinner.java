package tictactoe;

public class CheckWinner {

    private final char player;
    private final char[] board;

    public CheckWinner(char[] board, char player) {
        this.board = board;
        this.player = player;

    }

    public int getWinner() {
        int winner = 0;
        if (board[0] != ' ' && board[0] == board[1] && board[0] == board[2]) {
            winner = board[0] == player ? 1 : -1;
        } else if (board[3] != ' ' && board[3] == board[4] && board[3] == board[5]) {
            winner = board[3] == player ? 1 : -1;
        } else if (board[6] != ' ' && board[6] == board[7] && board[6] == board[8]) {
            winner = board[6] == player ? 1 : -1;
        } else if (board[0] != ' ' && board[0] == board[3] && board[0] == board[6]) {
            winner = board[0] == player ? 1 : -1;
        } else if (board[1] != ' ' && board[1] == board[4] && board[1] == board[7]) {
            winner = board[1] == player ? 1 : -1;
        } else if (board[2] != ' ' && board[2] == board[5] && board[2] == board[8]) {
            winner = board[2] == player ? 1 : -1;
        } else if (board[0] != ' ' && board[0] == board[4] && board[0] == board[8]) {
            winner = board[0] == player ? 1 : -1;
        } else if (board[2] != ' ' && board[2] == board[4] && board[2] == board[6]) {
            winner = board[2] == player ? 1 : -1;
        }
        boolean isTie = true;
        for (char c : board) {
            if (c == ' ') {
                isTie = false;
            }
        }
        return isTie ? 2 : winner;
    }

}
