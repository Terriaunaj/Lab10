
public enum Peg {

	LEFT,
	MIDDLE,
	RIGHT;
	
	public static Peg other(Peg p1, Peg p2) {
		
		if(p1 == p2) {
			throw new IllegalArgumentException();
		}
		if(p1 == null || p2 == null) {
			throw new NullPointerException();
		}
		
	}
}
