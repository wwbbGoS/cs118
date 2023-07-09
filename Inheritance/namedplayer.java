public class NamedPlayer extends Player{
    private char mark;
    private String name;

    public NamedPlayer(char mark, String name) {
    	super(mark);
        this.name = name;
    }

   	public String getName() { return name;}
}