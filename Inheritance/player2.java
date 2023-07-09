import java.util.*;

public class Player2 {
    private char mark;

    public Player(char mark) {
        this.mark = mark;
    }

    public char getMark(){
        return mark;
    }

    public void playMove(Board game){
        System.out.print("Row: ");
        int i = getInput();
        System.out.print("Col: ");
        int j = getInput();
        game.playMove(this, i, j);
    }

    private int getInput() {
        Scanner sinput = new Scanner(System.in);
        try {
            return sinput.nextInt();
        } catch (InputMismatchException e) {
            return getInput();
        }
    }

}