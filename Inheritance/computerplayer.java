public class ComputerPlayer extends NamedPlayer{

    public ComputerPlayer(char mark) {
        super(mark, "GLaDoS");
    }

    public void playMove(Board game){
    	System.out.println("Thinking...");
    	int i;
    	int j;
    	do {

	    	i = (int)Math.floor(Math.random() * 3);
	    	j = (int)Math.floor(Math.random() * 3);

	   } while (game.squareUsed(i, j));

	   game.playMove(this, i, j);
    }

}