import java.util.Scanner;
import java.util.InputMismatchException;

public class NaughtsAndCrosses2 {

    public static int getInput() {
        Scanner sinput = new Scanner(System.in);
        try {
            return sinput.nextInt();
        } catch (InputMismatchException e) {
            return getInput();
        }
    }

    public static String getStringInput() {
        Scanner sinput = new Scanner(System.in);
        try {
            return sinput.nextLine();
        } catch (InputMismatchException e) {
            return getStringInput();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        String name = getStringInput();

        NamedPlayer p1 = new NamedPlayer('O', name);
        NamedPlayer p2 = new ComputerPlayer('X');
        Board game = new Board(p1, p2);

        while ((game.getWinner() == null) && (game.isFull() == false)) {
            game.printBoard();
            Player currentPlayer = game.getNextPlayer();
            System.out.println("Player - " + ((NamedPlayer)currentPlayer).getName());
            currentPlayer.playMove(game);
        }
        game.printBoard();
        if (game.getWinner() != null) {
            System.out.println("The winner is: " + 
                                                ((NamedPlayer)game.getWinner()).getName());
        } else {
            System.out.println("The game was drawn");
        }
    }
}