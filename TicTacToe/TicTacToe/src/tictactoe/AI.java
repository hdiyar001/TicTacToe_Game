package tictactoe;

public class AI {

    private final char[] board;

    // ->#0:isRunning   ->#1:Won    ->#-1:Lost    ->#2:Tie
    private final char player;

    public AI(char[] board, char player) {
        this.board = board;
        this.player = player;
    }

    // the minimax algorithm
    public int minimax(int depth, int turn) {
        CheckWinner cw = new CheckWinner(board, player);
        int winner = cw.getWinner();
        if (winner != 0) {
            if (winner == -1) {
                return -1;
            } else if (winner == 1) {
                return +1;
            }
            if (winner == 2) {
                return 0;
            }
        }

//        List<GameMove> gameMovesAvailable = getAvailableGameMoves();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

//        for (int i = 0; i < gameMovesAvailable.size(); ++i) {
        //            GameMove gameMove = gameMovesAvailable.get(i);
        //
        //            if (turn == 1) {
        //                makeGameMove(gameMove, 1);
        //                int currentScore = minimax(depth + 1, 2);
        //                max = Math.max(currentScore, max);
        //
        //                if (depth == 0) {
        //                    System.out.println("info: score for position " + (i + 1) + ": " + currentScore);
        //                }
        //                if (currentScore >= 0) {
        //                    if (depth == 0) {
        //                        computersGameMove = gameMove;
        //                    }
        //                } else if (currentScore == 1) {
        //                    resetGameMove(gameMove);
        //                    break;
        //                }
        //                if (i == availableGameMoves.size() - 1 && max > 0) {
        //                    if (depth == 0) {
        //                        computersGameMove = gameMove;
        //                    }
        //        }
        //    }
//            else if (turn == 2) {
//                makeGameMove(gameMove, 2);
//        int currentScore = minimax(depth + 1, 1);
//        min = Math.min(currentScore, min);
//        if (min == -1) {
//            resetGameMove(gameMove);
//            break;
//        }
//    }
//
//            resetGameMove(gameMove);
//        }
        return (turn == 1) ? max : min;
    }

    public void resetGameMove(int i) {
        board[i] = 0;
    }

    public void makeGameMove(int i, char player) {

        board[i] = player;
    }

}
