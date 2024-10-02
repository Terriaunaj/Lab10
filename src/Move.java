
public enum Move {

	LEFT_TO_MIDDLE(LEFT, MIDDLE),
	LEFT_TO_RIGHT(LEFT, RIGHT),
	MIDDLE_TO_LEFT(MIDDLE, LEFT),
	MIDDLE_TO_RIGHT(MIDDLE, RIGHT),
	RIGHT_TO_LEFT(RIGHT, LEFT),
	RIGHT_TO_MIDDLE(RIGHT, MIDDLE);
	
	public Peg from;
	public Peg to;
	
	private Move (Peg from, Peg to) {
		
	}
	
	public Move move(Peg from, Peg to) {
		
	}
}
