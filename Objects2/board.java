public class Board {
    private Player[][] board;
    private int moves;
    private Player p1;
    private Player p2;

    public Board(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        moves = 0;
        board = new Player[3][3];
    }

    public void printBoard(){
        System.out.println("  -0–—1—–2-");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i) + " ");
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null)
                    System.out.print("   ");
                else
                    System.out.print(" " + board[i][j].getMark() + " ");
            }
            System.out.println(" " + (i));
        }
        System.out.println("  -0——1——2-");
    }

    public void playMove(Player p, int i, int j){
        if (i > 2 || j > 2) {
            System.out.println("Move is out of bounds");
            return;
        }

        if (board[i][j] == null) {
            board[i][j] = p;
            moves++;
        }
        else {
            System.err.println("Invalid move. Please try again.");
        }

    }

    public Player getNextPlayer () {
        if (moves % 2 == 0) return p1;
        else return p2;
    }

    public Player getWinner() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != null && board[i][1] != null && board[i][2] != null)
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
                    return board[i][0]; 
            if (board[0][i] != null && board[1][i] != null && board[2][i] != null)
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
                    return board[0][i];
        }
        if (board[0][0] != null && board[1][1] != null && board[2][2] != null)
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
                return board[0][0];
        if (board[0][2] != null && board[1][1] != null && board[2][0] != null)
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
                return board[1][1];
        return null;
    }

    public boolean isFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null)
                    return false;
            }
        }
        return true;
    }

    

}