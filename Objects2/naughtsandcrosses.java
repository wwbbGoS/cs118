import java.util.Scanner;
import java.util.InputMismatchException;

public class NaughtsAndCrosses {

    public static int getInput() {
        Scanner sinput = new Scanner(System.in);
        try {
            return sinput.nextInt();
        } catch (InputMismatchException e) {
            return getInput();
        }
    }

    public static void main(String[] args) {
        Player p1 = new Player('O');
        Player p2 = new Player('X');
        Board game = new Board(p1, p2);

        while ((game.getWinner() == null) && (game.isFull() == false)) {
            game.printBoard();
            Player currentPlayer = game.getNextPlayer();
            System.out.println("Player - " + currentPlayer.getMark());
            System.out.print("Row: ");
            int i = getInput();
            System.out.print("Col: ");
            int j = getInput();
            game.playMove(currentPlayer, i, j);
        }
        game.printBoard();
        if (game.getWinner() != null) {
            System.out.println("The winner is: " + 
                                                game.getWinner().getMark());
        } else {
            System.out.println("The game was drawn");
        }
    }
}